package com.geekster.studentApp.controller;


import com.geekster.studentApp.model.Laptop;
import com.geekster.studentApp.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;


    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop newLaptop){
        return laptopService.addLaptop(newLaptop);
    }



    @GetMapping("laptops")
    public List<Laptop> getAllLaptop()
    {
        return laptopService.getAllLaptop();
    }
}
