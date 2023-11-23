package com.geekster.studentApp.service;

import com.geekster.studentApp.model.Laptop;
import com.geekster.studentApp.repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    LaptopRepo laptopRepo;

    public String addLaptop(Laptop newLaptop) {
        laptopRepo.save(newLaptop);
        return "new added Laptop";
    }

    public List<Laptop> getAllLaptop() {
        return laptopRepo.findAll();
    }
}
