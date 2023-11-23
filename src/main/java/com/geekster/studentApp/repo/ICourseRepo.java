package com.geekster.studentApp.repo;

import com.geekster.studentApp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Integer> {
}
