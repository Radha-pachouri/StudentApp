package com.geekster.studentApp.controller;

import com.geekster.studentApp.model.Student;
import com.geekster.studentApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("student")
    public String addStudent(@RequestBody Student newStudent){
        return studentService.addStudent(newStudent);
    }



    @GetMapping("studnets")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    @DeleteMapping("/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId) {
        studentService.deleteStudent(studentId);
        return "Student deleted successfully";
    }

    @PutMapping("/{studentId}")
    public String updateStudent(@PathVariable Integer studentId, @RequestBody Student updatedStudent) {
        studentService.updateStudent(studentId, updatedStudent);
        return "Student updated successfully";
    }
}
