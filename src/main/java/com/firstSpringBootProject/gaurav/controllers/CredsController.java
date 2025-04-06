package com.firstSpringBootProject.gaurav.controllers;


import com.firstSpringBootProject.gaurav.helper.Creds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/creds")
public class CredsController {

    @Autowired
    private Creds creds;

    @GetMapping("")
    public Creds getCreds(){
        return creds;
    }
}
