/**
 * 
 */
package com.surveyproject.atozstore.customers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.surveyproject.atozstore.entities.Customer;
import com.surveyproject.atozstore.entities.Order;

/**
 * @author Nikhil
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	Customer findByEmail(String email);

	@Query("select o from Order o where o.customer.email=?1")
	List<Order> getCustomerOrders(String email);

}
