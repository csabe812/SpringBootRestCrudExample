package com.github.csabe812.SpringBootRestCrudExample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.github.csabe812.SpringBootRestCrudExample.domain.Pet;

public interface PetRepository extends MongoRepository<Pet, String> {

}
