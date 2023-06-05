package com.mycom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycom.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
	
}
