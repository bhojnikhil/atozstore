/**
 * 
 */
package com.surveyproject.atozstore.security;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surveyproject.atozstore.entities.Permission;

/**
 * @author Nikhil
 *
 */
public interface PermissionRepository extends JpaRepository<Permission, Integer>
{

}
