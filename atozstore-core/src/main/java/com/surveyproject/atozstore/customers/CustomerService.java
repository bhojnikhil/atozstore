/**
 * 
 */
package com.surveyproject.atozstore.customers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.surveyproject.atozstore.entities.Customer;
import com.surveyproject.atozstore.entities.Order;

/**
 * @author Nikhil
 *
 */
@Service
@Transactional
public class CustomerService {
	@Autowired CustomerRepository customerRepository;
	
	public Customer getCustomerByEmail(String email) {
		return customerRepository.findByEmail(email);
	}

	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	public Customer getCustomerById(Integer id) {
		return customerRepository.findOne(id);
	}

	public List<Order> getCustomerOrders(String email) {
		return customerRepository.getCustomerOrders(email);
	}

}
