package com.firstSpringBootProject.gaurav.helper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
public class Creds {

    @JsonProperty("url")
    @JsonPropertyDescription("Username for the user")
    private String username;

    @JsonProperty("password")
    @JsonPropertyDescription("Password for the user")
    private String password;

    //Getters
    public String getUrl() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    //Setters
    public void setUrl(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
