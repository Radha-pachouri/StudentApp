package com.geekster.studentApp.repo;

import com.geekster.studentApp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}
