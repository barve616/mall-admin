package com.macro.mall.communicate.resourcecenter.bean;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Validated
public class CoachTeamInfoVO {
    @ApiModelProperty(value = "教练id")
    private String coachId;

    @NotEmpty(message = "教练名称不能为为空")
    @Size(min = 1, max = 50, message = "教练名称不能超过50个字符！")
    @ApiModelProperty(value = "教练名称")
    private String coachName;

    @NotEmpty(message = "教练性别不能为为空")
    @ApiModelProperty(value = "教练性别")
    private String coachGender;

    @NotEmpty(message = "特长不能为为空")
    @ApiModelProperty(value = "特长")
    @Size(min = 1, max =200, message = "特长不能超过200个字符！")
    private String specialty;

    @NotEmpty(message = "教龄不能为为空")
    @ApiModelProperty(value = "教龄")
    @Size(min = 1, max =5, message = "教龄不能超过5个字符！")
    private String teachingAge;

    @NotEmpty(message = "教练头像不能为为空")
    @ApiModelProperty(value = "教练头像")
    private String coachHeadUrl;

    @NotEmpty(message = "店铺id不能为为空")
    @ApiModelProperty(value = "店铺id")
    private String shopId;

    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getCoachGender() {
        return coachGender;
    }

    public void setCoachGender(String coachGender) {
        this.coachGender = coachGender;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getTeachingAge() {
        return teachingAge;
    }

    public void setTeachingAge(String teachingAge) {
        this.teachingAge = teachingAge;
    }

    public String getCoachHeadUrl() {
        return coachHeadUrl;
    }

    public void setCoachHeadUrl(String coachHeadUrl) {
        this.coachHeadUrl = coachHeadUrl;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Override
    public String toString() {
        return "CoachTeamInfoVO{" +
                "coachId='" + coachId + '\'' +
                ", coachName='" + coachName + '\'' +
                ", coachGender='" + coachGender + '\'' +
                ", specialty='" + specialty + '\'' +
                ", teachingAge='" + teachingAge + '\'' +
                ", coachHeadUrl='" + coachHeadUrl + '\'' +
                ", shopId='" + shopId + '\'' +
                '}';
    }
}
