package com.qcdl.rest.dto;

import com.qcdl.model.entity.SettingInformation;
import io.swagger.annotations.ApiModelProperty;

/**
 * infinite-alliance
 *
 * @author 魏自东
 * @date 2018/3/16 10:08
 */
public class InformationDto extends SettingInformation {
    /**
     * 行业
     */
    @ApiModelProperty(value = "行业")
    private String industry;

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}
