package com.px.system.service;

import java.util.List;
import com.px.system.domain.ExamIndicatorResult;

/**
 * 指标考核结果Service接口
 * 
 * @author 品讯科技
 * @date 2024-08
 */
public interface IExamIndicatorResultService 
{
    /**
     * 查询指标考核结果
     * 
     * @param id 指标考核结果主键
     * @return 指标考核结果
     */
    public ExamIndicatorResult selectExamIndicatorResultById(Long id);

    /**
     * 查询指标考核结果列表
     * 
     * @param examIndicatorResult 指标考核结果
     * @return 指标考核结果集合
     */
    public List<ExamIndicatorResult> selectExamIndicatorResultList(ExamIndicatorResult examIndicatorResult);

    /**
     * 新增指标考核结果
     * 
     * @param examIndicatorResult 指标考核结果
     * @return 结果
     */
    public int insertExamIndicatorResult(ExamIndicatorResult examIndicatorResult);

    /**
     * 修改指标考核结果
     * 
     * @param examIndicatorResult 指标考核结果
     * @return 结果
     */
    public int updateExamIndicatorResult(ExamIndicatorResult examIndicatorResult);

    /**
     * 批量删除指标考核结果
     * 
     * @param ids 需要删除的指标考核结果主键集合
     * @return 结果
     */
    public int deleteExamIndicatorResultByIds(Long[] ids);

    /**
     * 删除指标考核结果信息
     * 
     * @param id 指标考核结果主键
     * @return 结果
     */
    public int deleteExamIndicatorResultById(Long id);
}
