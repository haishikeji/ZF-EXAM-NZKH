package com.px.web.controller.system;

import java.util.List;

import com.px.system.domain.ExamIndicator;
import com.px.system.service.IExamIndicatorService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.px.common.annotation.Log;
import com.px.common.core.controller.BaseController;
import com.px.common.core.domain.AjaxResult;
import com.px.common.enums.BusinessType;
import com.px.common.core.page.TableDataInfo;

/**
 * 指标体系Controller
 *
 * @author 品讯科技
 * @date 2024-08
 */
@RestController
@RequestMapping("/system/sys")
public class ExamIndexSysController extends BaseController
{
    @Autowired
    private IExamIndicatorService examIndicatorService;

    /**
     * 查询指标体系列表
     */
    @PreAuthorize("@ss.hasPermi('system:indicator:list')")
    @GetMapping("/list")
    public TableDataInfo list(ExamIndicator examIndicator)
    {
        startPage();
        examIndicator.setIndicatorClass("0");
        List<ExamIndicator> list = examIndicatorService.selectExamIndicatorList(examIndicator);
        return getDataTable(list);
    }

    /**
     * 查询指标体系列表
     */
    @GetMapping("/getIndexSysList")
    public AjaxResult getIndexSysList(ExamIndicator examIndicator)
    {
        examIndicator.setStatus("0");
        examIndicator.setIndicatorClass("0");
        List<ExamIndicator> list = examIndicatorService.selectExamIndicatorList(examIndicator);
        return success(list);
    }


    /**
     * 获取指标体系详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:indicator:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(examIndicatorService.selectExamIndicatorById(id));
    }

    /**
     * 新增指标体系
     */
    @PreAuthorize("@ss.hasPermi('system:indicator:add')")
    @Log(title = "指标体系", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ExamIndicator examIndicator)
    {
        examIndicator.setCreateBy(getUsername());
        examIndicator.setIndicatorClass("0");
        return toAjax(examIndicatorService.insertExamIndicatorSys(examIndicator));
    }

    /**
     * 修改指标体系
     */
    @PreAuthorize("@ss.hasPermi('system:indicator:edit')")
    @Log(title = "指标体系", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ExamIndicator examIndicator)
    {
        examIndicator.setUpdateBy(getUsername());
        return toAjax(examIndicatorService.updateExamIndicatorSys(examIndicator));
    }

    @PostMapping("/checkSysCodeUnique")
    public AjaxResult checkSysCodeUnique(@RequestBody ExamIndicator examIndicator){
        Boolean result = examIndicatorService.checkIndicatorCodeUnique(examIndicator);
        if (result){
            return success("0");
        }else{
            return success("1");
        }
    }

    /**
     * 删除指标体系
     */
    @PreAuthorize("@ss.hasPermi('system:indicator:remove')")
    @Log(title = "指标体系", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(examIndicatorService.deleteExamIndicatorByIds(ids));
    }

}
