package com.github.csabe812.SpringBootRestCrudExample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.csabe812.SpringBootRestCrudExample.domain.Pet;
import com.github.csabe812.SpringBootRestCrudExample.repository.PetRepository;

@RestController
public class PetController {

	@Autowired
	private PetRepository petRepository;

	@PostMapping("/addPet")
	public String savePet(@RequestBody Pet pet) {
		petRepository.save(pet);
		return "Added pet with id: " + pet.getId();
	}

	@GetMapping("/findAllPets")
	public List<Pet> getPets() {
		return petRepository.findAll();
	}

	@GetMapping("/findOnePetById/{id}")
	public Optional<Pet> getPet(@PathVariable String id) {
		return petRepository.findById(id);
	}

	@DeleteMapping("/deletePetById/{id}")
	public String deletePet(@PathVariable String id) {
		petRepository.deleteById(id);
		return "Pet deleted with id: " + id;
	}

}
