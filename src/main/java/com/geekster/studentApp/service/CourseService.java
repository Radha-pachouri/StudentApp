package com.geekster.studentApp.service;

import com.geekster.studentApp.model.Course;
import com.geekster.studentApp.repo.ICourseRepo;
import com.geekster.studentApp.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
    @Autowired
    ICourseRepo iCourseRepo;

   @Autowired
    StudentRepo studentRepo;

    public List<Course> getCourse() {
        return iCourseRepo.findAll();
    }


    public String saveCourse(Course newCourse) {
        iCourseRepo.save(newCourse);
        return "course added";
    }
}
