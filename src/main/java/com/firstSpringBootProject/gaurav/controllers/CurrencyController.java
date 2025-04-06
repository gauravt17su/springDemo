package com.firstSpringBootProject.gaurav.controllers;

import com.firstSpringBootProject.gaurav.helper.FlagDefinitions;
import com.firstSpringBootProject.gaurav.helper.FlagProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/currency" , produces = MediaType.APPLICATION_JSON_VALUE)
public class CurrencyController {

    @Autowired
    private FlagProperties flagProperties;

    @GetMapping("/flags")
    public FlagProperties flagProperties(){
        return flagProperties;
    }
}
