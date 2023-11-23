package com.geekster.studentApp.service;

import com.geekster.studentApp.model.Student;
import com.geekster.studentApp.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;



    public String addStudent(Student newStudent) {
        studentRepo.save(newStudent);
        return "student Added";
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }


    public void deleteStudent(Integer studentId) {
        studentRepo.deleteById(studentId);
    }

    public void updateStudent(Integer studentId, Student updatedStudent) {

        Student existingStudent = studentRepo.findById(studentId).orElse(null);
        if (existingStudent != null) {
            // Update fields with the new values
            existingStudent.setStudentName(updatedStudent.getStudentName());
            existingStudent.setStudentAge(updatedStudent.getStudentAge());
            existingStudent.setStudentPhoneNo(updatedStudent.getStudentPhoneNo());
            existingStudent.setStudentBranch(updatedStudent.getStudentBranch());
            existingStudent.setStudentDepartment(updatedStudent.getStudentDepartment());

            // Update the associated entities (courses, address) if needed

            // Save the updated student
            studentRepo.save(existingStudent);
        }
    }
}
