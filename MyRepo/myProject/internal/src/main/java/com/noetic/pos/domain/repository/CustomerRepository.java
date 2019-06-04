package com.noetic.pos.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.noetic.pos.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

}
