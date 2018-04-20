/**
 * 
 */
package com.surveyproject.atozstore.catalog;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surveyproject.atozstore.entities.Category;

/**
 * @author Nikhil
 *
 */
public interface CategoryRepository extends JpaRepository<Category, Integer>{

	Category getByName(String name);

}
