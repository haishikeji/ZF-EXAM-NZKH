package com.px.system.service;

import java.util.List;
import com.px.system.domain.ExamIndicatorTaskFile;

/**
 * 任务附件Service接口
 *
 * @author 品讯科技
 * @date 2024-08
 */
public interface IExamIndicatorTaskFileService
{
    /**
     * 查询任务附件
     *
     * @param id 任务附件主键
     * @return 任务附件
     */
    public ExamIndicatorTaskFile selectExamIndicatorTaskFileById(Long id);

    /**
     * 查询任务附件列表
     *
     * @param examIndicatorTaskFile 任务附件
     * @return 任务附件集合
     */
    public List<ExamIndicatorTaskFile> selectExamIndicatorTaskFileList(ExamIndicatorTaskFile examIndicatorTaskFile);

    /**
     * 新增任务附件
     *
     * @param examIndicatorTaskFile 任务附件
     * @return 结果
     */
    public int insertExamIndicatorTaskFile(ExamIndicatorTaskFile examIndicatorTaskFile);


    /**
     * 批量新增任务附件
     *
     * @param examIndicatorTaskFileList 任务附件
     * @return 结果
     */
    public int insertExamIndicatorTaskFileList(List<ExamIndicatorTaskFile> examIndicatorTaskFileList);

    /**
     * 修改任务附件
     *
     * @param examIndicatorTaskFile 任务附件
     * @return 结果
     */
    public int updateExamIndicatorTaskFile(ExamIndicatorTaskFile examIndicatorTaskFile);

    /**
     * 批量删除任务附件
     *
     * @param ids 需要删除的任务附件主键集合
     * @return 结果
     */
    public int deleteExamIndicatorTaskFileByIds(Long[] ids);

    /**
     * 删除任务附件信息
     *
     * @param id 任务附件主键
     * @return 结果
     */
    public int deleteExamIndicatorTaskFileById(Long id);
}
