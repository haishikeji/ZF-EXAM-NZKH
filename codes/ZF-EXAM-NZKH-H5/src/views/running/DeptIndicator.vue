<template>
  <van-cell required :label="fieldValue" is-link readonly title="单位" placeholder="请选择单位" @click="show = true" size="large" />
  <van-cell required is-link title="选择时间节点" @click="showTime = true" :label="queryParam.name" size="large" />
  <van-row style="margin-top: 15px; color: #888; font-size: 14px; font-weight: bold; line-height: 50px; text-align: center">
    <van-col span="8">指标名称(分值)</van-col>
    <van-col span="5">预估得分</van-col>
    <van-col span="5">预估排名</van-col>
    <van-col span="5">状态</van-col>
  </van-row>
  <van-list v-model:loading="loading" :finished="finished" finished-text="没有更多了" @load="getList">
    <van-row style="font-size: 16px; text-align: center" align="left" v-for="item in list">
      <van-col span="8">{{ item.indicatorCode }}-{{ item.indicatorName }}-({{ item.indicatorScore }})</van-col>
      <van-col span="5">{{ item.currentScore || 0 }}</van-col>
      <van-col span="5">{{ item.currentRanking }}</van-col>
      <van-col span="5">
        <span class="light-yellow-circle" v-if="item.lightStatus === 'YELLOW'"></span>
        <span class="light-red-circle" v-else-if="item.lightStatus === 'RED'"></span>
        <!--        <span class="light-green-circle" v-else-if="store.indicatorItem.lightStatus=== 'GREEN'"></span>-->
        <span class="light-green-circle" v-else></span>
      </van-col>
      <van-col span="1" @click="viewDetail(item)"><van-icon name="arrow" size="18px" /></van-col>
    </van-row>
  </van-list>

  <van-popup v-model:show="show" round position="bottom">
    <van-cascader v-model="cascaderValue" title="请选择单位" :options="items" @close="show = false" @change="onChange" @finish="onFinish">
      <template #title>
        <h3 style="width: 80vw; text-align: center"
          ><van-icon style="float: left" name="success" size="30px" color="#07c160" @click="onConfirm" /> 请选择单位</h3
        >
      </template>
    </van-cascader>
  </van-popup>
  <van-popup v-model:show="showTime" round position="bottom">
    <van-picker title="时间点" :columns="actionTimes" @confirm="onSelectTime" @cancel="showTime = false" />
  </van-popup>
</template>

<script>
  import { getDeptTree, getDeptRunning } from '@/api/running';
  import { runningStore } from '@/store/modules/Running';
  import { useRouter } from 'vue-router';
  import { ref, onMounted } from 'vue';
  import router from '../../router';
  import { getParentByIndicatorClass, getIndicatorById } from '@/api/indicator';
  import { showLoadingToast } from 'vant';

  export default {
    setup() {
      const show = ref(false);
      const fieldValue = ref('');
      const cascaderValue = ref('');
      // 选项列表，children 代表子选项，支持多级嵌套
      const items = ref([]);
      const convertDeptTree = (deptTree) => {
        deptTree.forEach((item) => {
          item.text = item.label;
          item.value = item.id;
          if (item.children) {
            convertDeptTree(item.children);
          }
        });
      };
      const onChange = (options) => {
        const selectedOptions = options.selectedOptions;
        fieldValue.value = selectedOptions.map((option) => option.text).join('/');
        queryParam.deptId = options.value;
      };
      onMounted(() => {
        getDeptTree()
          .then((res) => {
            convertDeptTree(res.data);
            items.value = res.data;
          })
          .catch((e) => {
            console.log(e);
          });
      });
      // 全部选项选择完毕后，会触发 finish 事件
      const onFinish = (options) => {
        const selectedOptions = options.selectedOptions;
        show.value = false;
        fieldValue.value = selectedOptions.map((option) => option.text).join('/');
        initQueryList();
      };
      const onConfirm = () => {
        show.value = false;
        initQueryList();
        getList();
      };
      const initQueryList = () => {
        list.value = [];
        queryParam.pageNum = 1;
      };

      const showTime = ref(false);
      const actionTimes = [
        { text: '一季度', value: 1 },
        { text: '二季度', value: 2 },
        { text: '三季度', value: 3 },
        { text: '四季度', value: 4 },
        { text: '半年', value: 5 },
        { text: '全年', value: 6 },
      ];
      const queryParam = reactive({
        evaluationTimeline: undefined,
        name: '',
        deptId: undefined,
        pageNum: 1,
        pageSize: 20,
      });
      const onSelectTime = ({ selectedOptions }) => {
        // 默认情况下点击选项时不会自动收起
        // 可以通过 close-on-click-action 属性开启自动收起
        const item = selectedOptions[0];
        queryParam.evaluationTimeline = item.value;
        queryParam.name = item.text;
        showTime.value = false;
        initQueryList();
        getList();
      };
      const loading = ref(false);
      const list = ref([]);
      const finished = ref(true);
      const getList = () => {
        if (!queryParam.deptId || !queryParam.evaluationTimeline) {
          return;
        }
        loading.value = true;
        finished.value = false;
        getDeptRunning({
          queryDeptId: queryParam.deptId,
          evaluationTimeline: queryParam.evaluationTimeline,
          indicatorYear: new Date().getFullYear(),
          pageNum: queryParam.pageNum,
          pageSize: queryParam.pageSize,
        }).then((res) => {
          console.log(res);
          loading.value = false;
          list.value.push(...res.rows);
          if (res.rows.length < queryParam.pageSize) {
            finished.value = true;
          } else {
            queryParam.pageNum++;
          }
        });
      };

      const router = useRouter();
      const store = runningStore();
      const viewDetail = (item) => {
        const loadingToast = showLoadingToast('加载中');
        getParentByIndicatorClass(item.indicatorId, '1')
          .then((res) => {
            loadingToast.close();
            const params = { ...item };
            if (res.code === 200 && res.data) {
              params.categoryName = res.data.indicatorName;
            }
            store.setIndicatorItem(params);
            router.push({
              name: 'runningDetail',
              query: {
                id: item.indicatorId,
              },
            });
          })
          .catch((res) => {});
      };
      return {
        show,
        items,
        onFinish,
        fieldValue,
        cascaderValue,
        onChange,
        onConfirm,
        showTime,
        actionTimes,
        loading,
        queryParam,
        onSelectTime,
        list,
        finished,
        getList,
        viewDetail,
      };
    },
  };
</script>

<style scoped></style>
