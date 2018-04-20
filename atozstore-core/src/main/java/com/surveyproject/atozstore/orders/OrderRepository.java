/**
 * 
 */
package com.surveyproject.atozstore.orders;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surveyproject.atozstore.entities.Order;

/**
 * @author Nikhil
 *
 */
public interface OrderRepository extends JpaRepository<Order, Integer>
{
	Order findByOrderNumber(String orderNumber);
}
