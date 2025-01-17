package com.px.system.domain;

import com.px.common.annotation.Excel;
import com.px.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * 指标详情对象 exam_indicator
 *
 * @author 品讯科技
 * @date 2024-08
 */
public class ExamIndicatorRunningResult extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 表ID，主键，供其他表做外键 */
    private Long indicatorId;


    /** 指标编码 */
    @Excel(name = "指标编码")
    private String indicatorCode;

    /** 指标名称 */
    @Excel(name = "指标名称")
    private String indicatorName;

    /** 指标层级 */
    @Excel(name = "指标层级")
    private String indicatorHierarchy;

    /** 指标分值 */
    @Excel(name = "指标分值")
    private String indicatorScore;

    /** 指标类型 */
    @Excel(name = "指标类型")
    private String indicatorType;

    /** 指标类别 */
    @Excel(name = "指标类别")
    private String indicatorClass;

    /** 指标所属年度 */
    @Excel(name = "指标所属年度")
    private String indicatorYear;

    /** 父级ID */
    @Excel(name = "父级ID")
    private Long parentId;


    private String parentName;
    private Long categoryId;
    private String categoryName;
    private Long sysId;
    private String sysName;



    /** 考核责任单位 */
    @Excel(name = "考核责任单位")
    private String indicatorUnit;

    /** 指标责任领导 */
    @Excel(name = "指标责任领导")
    private String indicatorLeader;
    /** 指标责任领导ID */
    private Long[] indicatorLeaderIds;

    /** 指标录入部门ID */

    private String indicatorDept;
    @Excel(name = "指标录入部门")
    private String indicatorDeptName;


    private List<ExamIndicatorRunningResult> children  = new ArrayList<ExamIndicatorRunningResult>();

    /** 调度员 */
    private String indicatorDispatcher;
    @Excel(name = "调度员")
    private String indicatorDispatcherName;


    /** 任务ID */
    private Long taskId;
    /** 预估时间节点 */
    @Excel(name = "预估时间节点")
    private String evaluationTimeline;

    /** 当前排名 */
    @Excel(name = "当前排名")
    private String currentRanking;

    /** 当前得分 */
    @Excel(name = "当前得分")
    private String currentScore;

    /** 今年排名 */
    @Excel(name = "今年排名")
    private String yearRanking;

    /** 今年得分 */
    @Excel(name = "今年得分")
    private String yearScore;
    /** 是否可预测 */
    @Excel(name = "是否可预测")
    private String isEval;

    /** 无法预测成绩原因 */
    @Excel(name = "无法预测成绩原因")
    private String unpredictableReason;

    /** 指标运行情况 */
    @Excel(name = "指标运行情况")
    private String indicatorOperation;

    /** 是否为劣势指标 */
    @Excel(name = "是否为劣势指标")
    private String isBackward;

    /** 指标落后原因分析 */
    @Excel(name = "指标落后原因分析")
    private String backwardReason;
    /** 完成时限 */
    @Excel(name = "完成时限")
    private String indicatorComplete;

    /** 下一步推进计划 */
    @Excel(name = "下一步推进计划")
    private String nextPlan;

    /** 亮灯状态 */
    @Excel(name = "亮灯状态")
    private String lightStatus;

    /** 是否挂牌督办 */
    @Excel(name = "是否挂牌督办")
    private String listingSupervision;

    /** 填报人 */
    @Excel(name = "填报人")
    private String fillingUser;

    /** 考核时间节点 */
    @Excel(name = "考核时间节点")
    private String resultTimeline;

    /** 考核县区 */
    @Excel(name = "考核县区")
    private String resultDistrict;

    /** 考核得分 */
    @Excel(name = "考核得分")
    private String resultScore;

    /** 考核排名 */
    @Excel(name = "考核排名")
    private String resultRanking;
    /** 得分差距 */
    private String scoreDiff;
    /** 排名差距 */
    private String rankingDiff;

    /** 结果ID */
    private Long resultId;


    public void setIndicatorCode(String indicatorCode)
    {
        this.indicatorCode = indicatorCode;
    }

    public String getIndicatorCode()
    {
        return indicatorCode;
    }
    public void setIndicatorName(String indicatorName)
    {
        this.indicatorName = indicatorName;
    }

    public String getIndicatorName()
    {
        return indicatorName;
    }
    public void setIndicatorHierarchy(String indicatorHierarchy)
    {
        this.indicatorHierarchy = indicatorHierarchy;
    }

    public String getIndicatorHierarchy()
    {
        return indicatorHierarchy;
    }
    public void setIndicatorScore(String indicatorScore)
    {
        this.indicatorScore = indicatorScore;
    }

    public String getIndicatorScore()
    {
        return indicatorScore;
    }
    public void setIndicatorType(String indicatorType)
    {
        this.indicatorType = indicatorType;
    }

    public String getIndicatorType()
    {
        return indicatorType;
    }
    public void setIndicatorClass(String indicatorClass)
    {
        this.indicatorClass = indicatorClass;
    }

    public String getIndicatorClass()
    {
        return indicatorClass;
    }
    public void setIndicatorYear(String indicatorYear)
    {
        this.indicatorYear = indicatorYear;
    }

    public String getIndicatorYear()
    {
        return indicatorYear;
    }
    public void setParentId(Long parentId)
    {
        this.parentId = parentId;
    }

    public Long getParentId()
    {
        return parentId;
    }

    public void setIndicatorUnit(String indicatorUnit)
    {
        this.indicatorUnit = indicatorUnit;
    }

    public String getIndicatorUnit()
    {
        return indicatorUnit;
    }
    public void setIndicatorLeader(String indicatorLeader)
    {
        this.indicatorLeader = indicatorLeader;
    }

    public String getIndicatorLeader()
    {
        return indicatorLeader;
    }
    public void setIndicatorDept(String indicatorDept)
    {
        this.indicatorDept = indicatorDept;
    }

    public String getIndicatorDept()
    {
        return indicatorDept;
    }
    public void setIndicatorDispatcher(String indicatorDispatcher)
    {
        this.indicatorDispatcher = indicatorDispatcher;
    }

    public String getIndicatorDispatcher()
    {
        return indicatorDispatcher;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("indicatorCode", getIndicatorCode())
                .append("indicatorName", getIndicatorName())
                .append("indicatorHierarchy", getIndicatorHierarchy())
                .append("indicatorScore", getIndicatorScore())
                .append("indicatorType", getIndicatorType())
                .append("indicatorClass", getIndicatorClass())
                .append("indicatorYear", getIndicatorYear())
                .append("parentId", getParentId())

                .append("indicatorUnit", getIndicatorUnit())
                .append("remark", getRemark())
                .append("indicatorLeader", getIndicatorLeader())
                .append("indicatorDept", getIndicatorDept())
                .append("indicatorDispatcher", getIndicatorDispatcher())
                .append("createTime", getCreateTime())
                .append("createBy", getCreateBy())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())

                .toString();
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getIndicatorDeptName() {
        return indicatorDeptName;
    }

    public void setIndicatorDeptName(String indicatorDeptName) {
        this.indicatorDeptName = indicatorDeptName;
    }


    public Long[] getIndicatorLeaderIds() {
        return indicatorLeaderIds;
    }

    public void setIndicatorLeaderIds(Long[] indicatorLeaderIds) {
        this.indicatorLeaderIds = indicatorLeaderIds;
    }

    public List<ExamIndicatorRunningResult> getChildren() {
        return children;
    }

    public void setChildren(List<ExamIndicatorRunningResult> children) {
        this.children = children;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }


    public Long getSysId() {
        return sysId;
    }

    public void setSysId(Long sysId) {
        this.sysId = sysId;
    }

    public Long getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(Long indicatorId) {
        this.indicatorId = indicatorId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getIndicatorDispatcherName() {
        return indicatorDispatcherName;
    }

    public void setIndicatorDispatcherName(String indicatorDispatcherName) {
        this.indicatorDispatcherName = indicatorDispatcherName;
    }

    public String getEvaluationTimeline() {
        return evaluationTimeline;
    }

    public void setEvaluationTimeline(String evaluationTimeline) {
        this.evaluationTimeline = evaluationTimeline;
    }

    public String getCurrentRanking() {
        return currentRanking;
    }

    public void setCurrentRanking(String currentRanking) {
        this.currentRanking = currentRanking;
    }

    public String getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(String currentScore) {
        this.currentScore = currentScore;
    }

    public String getYearRanking() {
        return yearRanking;
    }

    public void setYearRanking(String yearRanking) {
        this.yearRanking = yearRanking;
    }

    public String getYearScore() {
        return yearScore;
    }

    public void setYearScore(String yearScore) {
        this.yearScore = yearScore;
    }

    public String getIsEval() {
        return isEval;
    }

    public void setIsEval(String isEval) {
        this.isEval = isEval;
    }

    public String getUnpredictableReason() {
        return unpredictableReason;
    }

    public void setUnpredictableReason(String unpredictableReason) {
        this.unpredictableReason = unpredictableReason;
    }

    public String getIndicatorOperation() {
        return indicatorOperation;
    }

    public void setIndicatorOperation(String indicatorOperation) {
        this.indicatorOperation = indicatorOperation;
    }

    public String getIsBackward() {
        return isBackward;
    }

    public void setIsBackward(String isBackward) {
        this.isBackward = isBackward;
    }

    public String getBackwardReason() {
        return backwardReason;
    }

    public void setBackwardReason(String backwardReason) {
        this.backwardReason = backwardReason;
    }

    public String getIndicatorComplete() {
        return indicatorComplete;
    }

    public void setIndicatorComplete(String indicatorComplete) {
        this.indicatorComplete = indicatorComplete;
    }

    public String getNextPlan() {
        return nextPlan;
    }

    public void setNextPlan(String nextPlan) {
        this.nextPlan = nextPlan;
    }

    public String getLightStatus() {
        return lightStatus;
    }

    public void setLightStatus(String lightStatus) {
        this.lightStatus = lightStatus;
    }

    public String getListingSupervision() {
        return listingSupervision;
    }

    public void setListingSupervision(String listingSupervision) {
        this.listingSupervision = listingSupervision;
    }

    public String getFillingUser() {
        return fillingUser;
    }

    public void setFillingUser(String fillingUser) {
        this.fillingUser = fillingUser;
    }


    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getResultTimeline() {
        return resultTimeline;
    }

    public void setResultTimeline(String resultTimeline) {
        this.resultTimeline = resultTimeline;
    }

    public String getResultDistrict() {
        return resultDistrict;
    }

    public void setResultDistrict(String resultDistrict) {
        this.resultDistrict = resultDistrict;
    }

    public String getResultScore() {
        return resultScore;
    }

    public void setResultScore(String resultScore) {
        this.resultScore = resultScore;
    }

    public String getResultRanking() {
        return resultRanking;
    }

    public void setResultRanking(String resultRanking) {
        this.resultRanking = resultRanking;
    }

    public Long getResultId() {
        return resultId;
    }

    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    public String getScoreDiff() {
        return scoreDiff;
    }

    public void setScoreDiff(String scoreDiff) {
        this.scoreDiff = scoreDiff;
    }

    public String getRankingDiff() {
        return rankingDiff;
    }

    public void setRankingDiff(String rankingDiff) {
        this.rankingDiff = rankingDiff;
    }
}
