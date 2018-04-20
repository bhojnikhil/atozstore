/**
 * 
 */
package com.surveyproject.atozstore.security;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surveyproject.atozstore.entities.User;

/**
 * @author Nikhil
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>
{

	User findByEmail(String email);

}
