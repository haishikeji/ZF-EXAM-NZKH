package com.px.system.mapper;

import java.util.List;

import com.px.system.domain.ExamIndicatorCategory;

/**
 * 指标类别Mapper接口
 *
 * @author 品讯科技
 * @date 2024-08
 */
public interface ExamIndicatorCategoryMapper
{
    /**
     * 查询指标类别
     *
     * @param id 指标类别主键
     * @return 指标类别
     */
    public ExamIndicatorCategory selectExamIndicatorCategoryById(Long id);

    /**
     * 查询指标类别列表
     *
     * @param examIndicatorCategory 指标类别
     * @return 指标类别集合
     */
    public List<ExamIndicatorCategory> selectExamIndicatorCategoryList(ExamIndicatorCategory examIndicatorCategory);

    /**
     * 新增指标类别
     *
     * @param examIndicatorCategory 指标类别
     * @return 结果
     */
    public int insertExamIndicatorCategory(ExamIndicatorCategory examIndicatorCategory);

    /**
     * 修改指标类别
     *
     * @param examIndicatorCategory 指标类别
     * @return 结果
     */
    public int updateExamIndicatorCategory(ExamIndicatorCategory examIndicatorCategory);

    /**
     * 删除指标类别
     *
     * @param id 指标类别主键
     * @return 结果
     */
    public int deleteExamIndicatorCategoryById(Long id);

    /**
     * 批量删除指标类别
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteExamIndicatorCategoryByIds(Long[] ids);

    /**
     * 校验用户名称是否唯一
     *
     * @param categoryCode 用户信息
     * @return 结果
     */
    public ExamIndicatorCategory checkCategoryCodeUnique(String categoryCode);
}
