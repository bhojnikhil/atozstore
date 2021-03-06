/**
 * 
 */
package com.surveyproject.atozstore.site.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.surveyproject.atozstore.customers.CustomerService;
import com.surveyproject.atozstore.entities.Customer;



/**
 * @author Nikhil
 *
 */
@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService
{
	@Autowired CustomerService customerService;
	@Override
	public UserDetails loadUserByUsername(String email)
			throws UsernameNotFoundException {
		Customer customer = customerService.getCustomerByEmail(email);
		if(customer == null){
			throw new UsernameNotFoundException("Email "+email+" not found");
		}
		return new AuthenticatedUser(customer);
	}

}
