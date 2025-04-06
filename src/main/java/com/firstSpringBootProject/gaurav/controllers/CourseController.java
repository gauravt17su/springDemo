package com.firstSpringBootProject.gaurav.controllers;

import com.firstSpringBootProject.gaurav.Course;
import com.firstSpringBootProject.gaurav.helper.FlagDefinitions;
import com.firstSpringBootProject.gaurav.helper.FlagProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private FlagProperties flagProperties;

    @RequestMapping( value = "/courses" , produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course( 1 , "werewtewtert AWS" , "in28Minutes") ,
                new Course( 25225 , "LearnDevOps" , "in28Minutes"));
    }
}
