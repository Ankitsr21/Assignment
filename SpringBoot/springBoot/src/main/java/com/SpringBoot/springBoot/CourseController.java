package com.SpringBoot.springBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> list1(){
        return Arrays.asList(
                new Course(1,"Spring","Kunal"),
                new Course(2,"Springframework","Abhinav"),
                new Course(2,"SpringBoot","Abhi")
        );
    }
}
