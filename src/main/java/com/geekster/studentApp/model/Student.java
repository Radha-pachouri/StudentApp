package com.geekster.studentApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private String studentName;
    private String studentAge;
    private String studentPhoneNo;
    private String studentBranch;
    private Education studentDepartment;


    @OneToMany
    @JoinColumn(name = "fk_course_id")
    Set<Course> courses;



    @OneToOne
    @JoinColumn(name = "fk_address_id")
    private Address address;


}
