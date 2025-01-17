package com.px.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.px.common.annotation.Excel;
import com.px.common.core.domain.BaseEntity;

/**
 * 年终考核对象 exam_assessment_task
 *
 * @author 品讯科技
 * @date 2024-08
 */
public class ExamAssessmentTask extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 指标ID */
    @Excel(name = "指标ID")
    private Long indicatorId;
    private String indicatorName;
    private ExamIndicator indicator;

    /** 考核对象 */

    private String respDept;
    @Excel(name = "考核对象")
    private String respDeptName;


    /** 牵头部门 */

    private String leadingDept;
    @Excel(name = "牵头部门")
    private String leadingDeptName;
    /** 考核得分 */
    @Excel(name = "考核得分")
    private String assessmentScore;

    /** 打分人 */
    @Excel(name = "打分人")
    private String assessmentUser;

    /** 打分时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "打分时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date assessmentTime;

    /** $column.columnComment */
    private String attributeCategory;

    /** $column.columnComment */
    private String attribute1;

    /** $column.columnComment */
    private String attribute2;

    /** $column.columnComment */
    private String attribute3;

    /** $column.columnComment */
    private String attribute4;

    /** $column.columnComment */
    private String attribute5;

    /** $column.columnComment */
    private String attribute6;

    /** $column.columnComment */
    private String attribute7;

    /** $column.columnComment */
    private String attribute8;

    /** $column.columnComment */
    private String attribute9;

    /** $column.columnComment */
    private String attribute10;

    /** $column.columnComment */
    private String attribute11;

    /** $column.columnComment */
    private String attribute12;

    /** $column.columnComment */
    private String attribute13;

    /** $column.columnComment */
    private String attribute14;

    /** $column.columnComment */
    private String attribute15;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setIndicatorId(Long indicatorId)
    {
        this.indicatorId = indicatorId;
    }

    public Long getIndicatorId()
    {
        return indicatorId;
    }
    public void setRespDept(String respDept)
    {
        this.respDept = respDept;
    }

    public String getRespDept()
    {
        return respDept;
    }
    public void setLeadingDept(String leadingDept)
    {
        this.leadingDept = leadingDept;
    }

    public String getLeadingDept()
    {
        return leadingDept;
    }
    public void setAssessmentScore(String assessmentScore)
    {
        this.assessmentScore = assessmentScore;
    }

    public String getAssessmentScore()
    {
        return assessmentScore;
    }
    public void setAssessmentUser(String assessmentUser)
    {
        this.assessmentUser = assessmentUser;
    }

    public String getAssessmentUser()
    {
        return assessmentUser;
    }
    public void setAssessmentTime(Date assessmentTime)
    {
        this.assessmentTime = assessmentTime;
    }

    public Date getAssessmentTime()
    {
        return assessmentTime;
    }
    public void setAttributeCategory(String attributeCategory)
    {
        this.attributeCategory = attributeCategory;
    }

    public String getAttributeCategory()
    {
        return attributeCategory;
    }
    public void setAttribute1(String attribute1)
    {
        this.attribute1 = attribute1;
    }

    public String getAttribute1()
    {
        return attribute1;
    }
    public void setAttribute2(String attribute2)
    {
        this.attribute2 = attribute2;
    }

    public String getAttribute2()
    {
        return attribute2;
    }
    public void setAttribute3(String attribute3)
    {
        this.attribute3 = attribute3;
    }

    public String getAttribute3()
    {
        return attribute3;
    }
    public void setAttribute4(String attribute4)
    {
        this.attribute4 = attribute4;
    }

    public String getAttribute4()
    {
        return attribute4;
    }
    public void setAttribute5(String attribute5)
    {
        this.attribute5 = attribute5;
    }

    public String getAttribute5()
    {
        return attribute5;
    }
    public void setAttribute6(String attribute6)
    {
        this.attribute6 = attribute6;
    }

    public String getAttribute6()
    {
        return attribute6;
    }
    public void setAttribute7(String attribute7)
    {
        this.attribute7 = attribute7;
    }

    public String getAttribute7()
    {
        return attribute7;
    }
    public void setAttribute8(String attribute8)
    {
        this.attribute8 = attribute8;
    }

    public String getAttribute8()
    {
        return attribute8;
    }
    public void setAttribute9(String attribute9)
    {
        this.attribute9 = attribute9;
    }

    public String getAttribute9()
    {
        return attribute9;
    }
    public void setAttribute10(String attribute10)
    {
        this.attribute10 = attribute10;
    }

    public String getAttribute10()
    {
        return attribute10;
    }
    public void setAttribute11(String attribute11)
    {
        this.attribute11 = attribute11;
    }

    public String getAttribute11()
    {
        return attribute11;
    }
    public void setAttribute12(String attribute12)
    {
        this.attribute12 = attribute12;
    }

    public String getAttribute12()
    {
        return attribute12;
    }
    public void setAttribute13(String attribute13)
    {
        this.attribute13 = attribute13;
    }

    public String getAttribute13()
    {
        return attribute13;
    }
    public void setAttribute14(String attribute14)
    {
        this.attribute14 = attribute14;
    }

    public String getAttribute14()
    {
        return attribute14;
    }
    public void setAttribute15(String attribute15)
    {
        this.attribute15 = attribute15;
    }

    public String getAttribute15()
    {
        return attribute15;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("indicatorId", getIndicatorId())
            .append("respDept", getRespDept())
            .append("leadingDept", getLeadingDept())
            .append("assessmentScore", getAssessmentScore())
            .append("remark", getRemark())
            .append("assessmentUser", getAssessmentUser())
            .append("assessmentTime", getAssessmentTime())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("attributeCategory", getAttributeCategory())
            .append("attribute1", getAttribute1())
            .append("attribute2", getAttribute2())
            .append("attribute3", getAttribute3())
            .append("attribute4", getAttribute4())
            .append("attribute5", getAttribute5())
            .append("attribute6", getAttribute6())
            .append("attribute7", getAttribute7())
            .append("attribute8", getAttribute8())
            .append("attribute9", getAttribute9())
            .append("attribute10", getAttribute10())
            .append("attribute11", getAttribute11())
            .append("attribute12", getAttribute12())
            .append("attribute13", getAttribute13())
            .append("attribute14", getAttribute14())
            .append("attribute15", getAttribute15())
            .toString();
    }

    public String getRespDeptName() {
        return respDeptName;
    }

    public void setRespDeptName(String respDeptName) {
        this.respDeptName = respDeptName;
    }

    public String getLeadingDeptName() {
        return leadingDeptName;
    }

    public void setLeadingDeptName(String leadingDeptName) {
        this.leadingDeptName = leadingDeptName;
    }

    public ExamIndicator getIndicator() {
        return indicator;
    }

    public void setIndicator(ExamIndicator indicator) {
        this.indicator = indicator;
    }

    public String getIndicatorName() {
        return indicatorName;
    }

    public void setIndicatorName(String indicatorName) {
        this.indicatorName = indicatorName;
    }
}
