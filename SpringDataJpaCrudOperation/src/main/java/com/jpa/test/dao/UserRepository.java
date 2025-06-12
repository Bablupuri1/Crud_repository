package com.jpa.test.dao;

import java.util.Collection;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	// we are capable or able to create custom method

//	public List<User> findByName(String name);

	// here find=introducer
	// ByName=property

	// when i write this method then spring data jpa automatically understand and
	// write query for method execute them internally

//	public List<User> findByNameAndCity(String name, String city);
//
//	public List<User> findByNameStartingWith(String prefix);
//
//	public List<User> findByNameEndingWith(String suffix);
//
//	public List<User> findByNameContaining(String words);
//
//	public List<User> findByAgeLessThan(String prefix);
//
//	public List<User> findByAgeGreaterThanEqual(String prefix);
//
//	public List<User> findByAgeIn(Collection<Integer> ages);
//
//	public List<User> findByNameOrderByName(String name);

//	====JPQL======================
	// JAVA PERCITENCE QUERRY LANGUAGE

//	@Query("select u from User u")
//	public List<User> getAllUser();

}
