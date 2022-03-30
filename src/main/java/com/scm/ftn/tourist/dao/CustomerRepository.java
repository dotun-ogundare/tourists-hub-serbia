package com.scm.ftn.tourist.dao;

import com.scm.ftn.tourist.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
