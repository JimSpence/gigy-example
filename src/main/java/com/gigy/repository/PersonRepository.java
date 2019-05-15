package com.gigy.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gigy.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
	
	Collection<Person> findAll();
	
	Person findByUsername(String username);

//    @Query(
//            value = "SELECT DISTINCT p FROM Person p " +
//                    "INNER JOIN FETCH p.skills s " +
//                    "INNER JOIN FETCH p.parties part")
//    Collection<Person> findAllPersonsNative();

}
