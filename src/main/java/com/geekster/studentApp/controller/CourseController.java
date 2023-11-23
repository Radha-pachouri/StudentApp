package com.geekster.studentApp.controller;

import com.geekster.studentApp.model.Course;
import com.geekster.studentApp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("course")
    public List<Course> getCourse()
    {
        return courseService.getCourse();
    }

    @PostMapping("course")
    public String addCourse(@RequestBody Course newCourse)
    {
        return courseService.saveCourse(newCourse);
    }

}
