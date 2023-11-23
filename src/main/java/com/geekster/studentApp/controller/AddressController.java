package com.geekster.studentApp.controller;

import com.geekster.studentApp.model.Address;
import com.geekster.studentApp.model.Student;
import com.geekster.studentApp.repo.AddressRepo;
import com.geekster.studentApp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;


    @PostMapping("address")
    public String addStudent(@RequestBody Address newAddress){
        return addressService.addAddress(newAddress);
    }



    @GetMapping("addresses")
    public List<Address> getAllAddress()
    {
        return addressService.getAllAddress();
    }
}
