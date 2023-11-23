package com.geekster.studentApp.repo;

import com.geekster.studentApp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
