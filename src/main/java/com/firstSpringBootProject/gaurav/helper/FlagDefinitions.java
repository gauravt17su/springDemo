package com.firstSpringBootProject.gaurav.helper;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.boot.context.properties.ConfigurationProperties;

@JsonPropertyOrder({"flagName" , "flagCd" , "flagDisplayCd"})
public class FlagDefinitions {

    @JsonProperty("flagCd")
    private String flagCd;

    @JsonProperty("flagName")
    private String flagName;

    @JsonProperty("flagDisplayCd")
    private String flagDisplayCd;

    @JsonProperty("flagCd")
    public String getFlagCd() {
        return flagCd;
    }

    @JsonProperty("flagName")
    public String getFlagName() {
        return flagName;
    }

    @JsonProperty("flagDisplayCd")
    public String getFlagDisplayCd() {
        return flagDisplayCd;
    }

    @JsonProperty("flagCd")
    public void setFlagCd(String flagCd) {
        this.flagCd = flagCd;
    }

    @JsonProperty("flagName")
    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    @JsonProperty("flagDisplayCd")
    public void setFlagDisplayCd(String flagDisplayCd) {
        this.flagDisplayCd = flagDisplayCd;
    }
}
