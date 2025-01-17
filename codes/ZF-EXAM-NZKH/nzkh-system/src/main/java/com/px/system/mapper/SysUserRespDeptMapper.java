package com.px.system.mapper;

import com.px.system.domain.SysUserRespDept;

import java.util.List;

/**
 * 用户与岗位关联表 数据层
 * 
 * @author 品讯科技
 */
public interface SysUserRespDeptMapper
{
    /**
     * 通过用户ID删除用户分管部门关联
     * 
     * @param userId 用户ID
     * @return 结果
     */
    public int deleteUserRespDeptByUserId(Long userId);

    /**
     * 通过部门ID查询分管部门使用数量
     * 
     * @param deptId 部门ID
     * @return 结果
     */
    public int countUserRespDeptById(Long deptId);

    /**
     * 批量删除用户和分管部门关联
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserRespDept(Long[] ids);

    /**
     * 批量新增用户分管部门信息
     * 
     * @param userRespDeptList 用户分管部门列表
     * @return 结果
     */
    public int batchUserRespDept(List<SysUserRespDept> userRespDeptList);

    /**
     * 根据用户ID获取部门选择框列表
     *
     * @param userId 用户ID
     * @return 选中岗位ID列表
     */
    public List<Long> selectRespDeptListByUserId(Long userId);
}
