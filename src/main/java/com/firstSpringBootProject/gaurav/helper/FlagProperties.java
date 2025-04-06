package com.firstSpringBootProject.gaurav.helper;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "moneyremit")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"flagDefinitons"})
@Component
public class FlagProperties {

    @JsonProperty("flagDefinitions")
    private List<FlagDefinitions> flagDefinitions;

    @JsonProperty("flagDefinitions")
    public List<FlagDefinitions> getFlagDefinitions() {
        if(CollectionUtils.isEmpty(flagDefinitions)){
            this.flagDefinitions = new ArrayList<>();
        }
        return flagDefinitions;
    }

    @JsonProperty("flagDefinitions")
    public void setFlagDefinitions(List<FlagDefinitions> flagDefinitions) {
        this.flagDefinitions = flagDefinitions;
    }
}
