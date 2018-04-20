/**
 * 
 */
package com.surveyproject.atozstore.security;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surveyproject.atozstore.entities.Role;

/**
 * @author Nikhil
 *
 */
public interface RoleRepository extends JpaRepository<Role, Integer>
{

	Role findByName(String name);

}
