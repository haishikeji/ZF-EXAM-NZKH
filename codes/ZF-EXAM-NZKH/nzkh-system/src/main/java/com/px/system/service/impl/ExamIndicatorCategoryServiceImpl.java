package com.px.system.service.impl;

import java.util.List;

import com.px.common.constant.UserConstants;
import com.px.common.utils.DateUtils;
import com.px.common.utils.StringUtils;
import com.px.system.mapper.ExamIndexSysMapper;
import com.px.system.mapper.ExamIndicatorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.px.system.mapper.ExamIndicatorCategoryMapper;
import com.px.system.domain.ExamIndicatorCategory;
import com.px.system.service.IExamIndicatorCategoryService;

/**
 * 指标类别Service业务层处理
 *
 * @author 品讯科技
 * @date 2024-08
 */
@Service
public class ExamIndicatorCategoryServiceImpl implements IExamIndicatorCategoryService
{
    @Autowired
    private ExamIndicatorCategoryMapper examIndicatorCategoryMapper;
    @Autowired
    private ExamIndexSysMapper examIndexSysMapper;

    @Autowired
    private ExamIndicatorMapper examIndicatorMapper;
    /**
     * 查询指标类别
     *
     * @param id 指标类别主键
     * @return 指标类别
     */
    @Override
    public ExamIndicatorCategory selectExamIndicatorCategoryById(Long id)
    {
        return examIndicatorCategoryMapper.selectExamIndicatorCategoryById(id);
    }

    /**
     * 查询指标类别列表
     *
     * @param examIndicatorCategory 指标类别
     * @return 指标类别
     */
    @Override
    public List<ExamIndicatorCategory> selectExamIndicatorCategoryList(ExamIndicatorCategory examIndicatorCategory)
    {
        return examIndicatorCategoryMapper.selectExamIndicatorCategoryList(examIndicatorCategory);
    }

    /**
     * 新增指标类别
     *
     * @param examIndicatorCategory 指标类别
     * @return 结果
     */
    @Override
    public int insertExamIndicatorCategory(ExamIndicatorCategory examIndicatorCategory)
    {
        examIndicatorCategory.setCreateTime(DateUtils.getNowDate());
        return examIndicatorCategoryMapper.insertExamIndicatorCategory(examIndicatorCategory);
    }

    /**
     * 修改指标类别
     *
     * @param examIndicatorCategory 指标类别
     * @return 结果
     */
    @Override
    public int updateExamIndicatorCategory(ExamIndicatorCategory examIndicatorCategory)
    {
        examIndicatorCategory.setUpdateTime(DateUtils.getNowDate());
        return examIndicatorCategoryMapper.updateExamIndicatorCategory(examIndicatorCategory);
    }

    /**
     * 批量删除指标类别
     *
     * @param ids 需要删除的指标类别主键
     * @return 结果
     */
    @Override
    public int deleteExamIndicatorCategoryByIds(Long[] ids)
    {
        return examIndicatorCategoryMapper.deleteExamIndicatorCategoryByIds(ids);
    }

    /**
     * 删除指标类别信息
     *
     * @param id 指标类别主键
     * @return 结果
     */
    @Override
    public int deleteExamIndicatorCategoryById(Long id)
    {
        return examIndicatorCategoryMapper.deleteExamIndicatorCategoryById(id);
    }

    @Override
    public boolean checkCategoryCodeUnique(ExamIndicatorCategory examIndicatorCategory) {
        Long categoryId = StringUtils.isNull(examIndicatorCategory.getId()) ? -1L : examIndicatorCategory.getId();
        ExamIndicatorCategory info = examIndicatorCategoryMapper.checkCategoryCodeUnique(examIndicatorCategory.getCategoryCode());
        if (StringUtils.isNotNull(info) && info.getId().longValue() != categoryId.longValue())
        {
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

//    @Override
//    public List<IndexSysTreeSelect> selectIndexSysTreeList(ExamIndicatorCategory examIndicatorCategory) {
//        ExamIndexSys indexSys=new ExamIndexSys();
//        indexSys.setSysYear(examIndicatorCategory.getSysYear());
//        indexSys.setSysName(examIndicatorCategory.getSysName());
//        indexSys.setSysUnit(examIndicatorCategory.getSysUnit());
//        indexSys.setSysType(examIndicatorCategory.getSysType());
//        indexSys.setId(examIndicatorCategory.getSysId());
//        System.out.println("########examIndicatorCategory#######"+examIndicatorCategory);
//        List<ExamIndexSys> returnList=examIndexSysMapper.selectExamIndexSysList(indexSys);
//        System.out.println("########returnList#######"+returnList);
//        List<ExamIndicatorCategory> examIndicatorCategorys = examIndicatorCategoryMapper.selectExamIndicatorCategoryList(examIndicatorCategory);
//
//        examIndicatorCategorys=buildCategoryTree(examIndicatorCategorys);
//        if(returnList!=null&&returnList.size()>0){
//            for(ExamIndexSys sys:returnList){
//                List<ExamIndicatorCategory> childrenList = new ArrayList<ExamIndicatorCategory>();
//                if(examIndicatorCategorys!=null&&examIndicatorCategorys.size()>0){
//                    for (ExamIndicatorCategory category : examIndicatorCategorys){
//                        if(sys.getId().equals(category.getSysId())){
//                            childrenList.add(category);
//                        }
//
//                    }
//                }
//                sys.setChildren(childrenList);
//            }
//        }
//
//        return returnList.stream().map(IndexSysTreeSelect::new).collect(Collectors.toList());
//
//    }

//@Override
//    public List<ExamIndicatorCategory> buildCategoryTree(List<ExamIndicatorCategory> examIndicatorCategorys) {
//        List<ExamIndicatorCategory> returnList = new ArrayList<ExamIndicatorCategory>();
//
//        if(examIndicatorCategorys!=null&&examIndicatorCategorys.size()>0){
//            for (ExamIndicatorCategory category : examIndicatorCategorys){
//                List<ExamIndicator> indicatorList= examIndicatorMapper.selectExamIndicatorListByCategoryId(category.getId().toString());
//
//                if(indicatorList!=null&&indicatorList.size()>0){
//                    for(ExamIndicator indicator:indicatorList){
//                     //   indicator.setCategory(category);
//                    }
//                    List<ExamIndicator> indicatorChildren=buildIndicatorTree(indicatorList);
//                    category.setChildren(indicatorChildren);
//                    returnList.add(category);
//                }else{
//                    returnList.add(category);
//                }
//            }
//        }
//        return returnList;
//    }
//    @Override
//    public List<ExamIndicator> buildIndicatorTree(List<ExamIndicator> indicators)
//    {
//        List<ExamIndicator> returnList = new ArrayList<ExamIndicator>();
//        List<Long> tempList = indicators.stream().map(ExamIndicator::getId).collect(Collectors.toList());
//        for (ExamIndicator indicator : indicators)
//        {
//            // 如果是顶级节点, 遍历该父节点的所有子节点
//            if (!tempList.contains(indicator.getParentId()))
//            {
//                recursionFn(indicators, indicator);
//                returnList.add(indicator);
//            }
//        }
//        if (returnList.isEmpty())
//        {
//            returnList = indicators;
//        }
//        return returnList;
//    }
//
//    /**
//     * 递归列表
//     */
//    private void recursionFn(List<ExamIndicator> list, ExamIndicator t)
//    {
//        // 得到子节点列表
//        List<ExamIndicator> childList = getChildList(list, t);
//        t.setChildren(childList);
//        for (ExamIndicator tChild : childList)
//        {
//            if (hasChild(list, tChild))
//            {
//                recursionFn(list, tChild);
//            }
//        }
//    }
//
//
//    /**
//     * 得到子节点列表
//     */
//    private List<ExamIndicator> getChildList(List<ExamIndicator> list, ExamIndicator t)
//    {
//        List<ExamIndicator> tlist = new ArrayList<ExamIndicator>();
//        Iterator<ExamIndicator> it = list.iterator();
//        while (it.hasNext())
//        {
//            ExamIndicator n = (ExamIndicator) it.next();
//            if (StringUtils.isNotNull(n.getParentId()) && n.getParentId() == t.getId())
//            {
//                tlist.add(n);
//            }
//        }
//        return tlist;
//    }
//
//    /**
//     * 判断是否有子节点
//     */
//    private boolean hasChild(List<ExamIndicator> list, ExamIndicator t)
//    {
//        return getChildList(list, t).size() > 0;
//    }

}
