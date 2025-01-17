package com.px.system.mapper;



import com.px.system.domain.ExamDeptIndicatorResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 指标详情Mapper接口
 *
 * @author 品讯科技
 * @date 2024-08
 */
public interface ExamDeptIndicatorResultMapper
{

    /**
     * 查询指标详情列表
     *
     * @param indicatorIds 指标详情
     * @return 指标详情集合
     */
    public List<ExamDeptIndicatorResult> selectExamDeptIndicatorResultList(@Param("indicatorIds") String[] indicatorIds,@Param("indicatorYear") String indicatorYear);

  //  public List<ExamDeptIndicatorResult> selectAllExamDeptIndicatorResultList(@Param("evaluationTimeline") String evaluationTimeline);

    public List<ExamDeptIndicatorResult> selectRespDeptListByDept(@Param("respDept")String  respDept,@Param("indicatorYear") String indicatorYear);
}
