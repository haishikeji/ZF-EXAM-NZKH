package com.px.system.service;



import com.px.system.domain.ExamAssessmentCount;

import java.util.List;

/**
 * 指标填报任务Service接口
 *
 * @author 品讯科技
 * @date 2024-08
 */
public interface IExamAssessmentCountService
{
    /**
     * 查询指标填报任务列表
     *
     * @param examAssessmentCount 指标填报任务
     * @return 指标填报任务集合
     */
    public List<ExamAssessmentCount> selectExamAssessmentCountList(ExamAssessmentCount examAssessmentCount);



}
