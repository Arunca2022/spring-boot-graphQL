package com.codeworld.spring.graphql.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.codeworld.spring.graphql.api.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Integer>{

	Person findByEmail(String email);

}
