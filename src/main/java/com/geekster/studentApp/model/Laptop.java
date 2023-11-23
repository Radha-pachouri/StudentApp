package com.geekster.studentApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer laptopId;
    private String laptopName;
    private Brand laptopBrand;
    private String laptopPrice;

    @OneToOne
    @JoinColumn(name = "fk_student_id")
    private Student student;

}
