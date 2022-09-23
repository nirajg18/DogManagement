package com.bandiClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Model.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer> {

}
