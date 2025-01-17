package com.px.system.service;

import java.util.List;

import com.px.system.domain.ExamIndicatorCategory;

/**
 * 指标类别Service接口
 *
 * @author 品讯科技
 * @date 2024-08
 */
public interface IExamIndicatorCategoryService
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
     * 批量删除指标类别
     *
     * @param ids 需要删除的指标类别主键集合
     * @return 结果
     */
    public int deleteExamIndicatorCategoryByIds(Long[] ids);

    /**
     * 删除指标类别信息
     *
     * @param id 指标类别主键
     * @return 结果
     */
    public int deleteExamIndicatorCategoryById(Long id);

    /**
     * 校验用户名称是否唯一
     *
     * @param examIndicatorCategory 用户信息
     * @return 结果
     */
    public boolean checkCategoryCodeUnique(ExamIndicatorCategory examIndicatorCategory);



//    /**
//     * 查询 指标类别树结构信息
//     *
//     * @param examIndicatorCategory 指标类别信息
//     * @return  指标类别树信息集合
//     */
//    public List<IndexSysTreeSelect> selectIndexSysTreeList(ExamIndicatorCategory examIndicatorCategory);
//
//    /**
//     * 构建前端所需要树结构
//     *
//     * @param examIndicatorCategorys 指标类别列表
//     * @return 树结构列表
//     */
//    public List<ExamIndicatorCategory> buildCategoryTree(List<ExamIndicatorCategory> examIndicatorCategorys);
//
//    public List<ExamIndicator> buildIndicatorTree(List<ExamIndicator> indicators);

}
