package com.mycom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mycom.model.Customer;
import com.mycom.model.Orderr;
@Repository
public interface OrderRepository extends JpaRepository<Orderr, Integer>{
	@Query(value = "select * from orderr p where p.customer =?1",nativeQuery=true)
	List<Orderr> getOrdList(Customer customer);

	

}
