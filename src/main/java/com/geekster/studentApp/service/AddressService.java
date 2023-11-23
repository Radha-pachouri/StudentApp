package com.geekster.studentApp.service;

import com.geekster.studentApp.model.Address;
import com.geekster.studentApp.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    public String addAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "address added";
    }

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }
}
