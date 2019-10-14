package com.techwaves.petcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techwaves.petcare.model.Pet;
import com.techwaves.petcare.service.PetCareService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/petcare")
public class PetController {
	
	private PetCareService petCareService;

	@Autowired
	public PetController(PetCareService thePetCareService) {
		petCareService = thePetCareService;
	}
		
	@GetMapping("/pets")
	public List<Pet> getPets(){
		
			return petCareService.findAll();
	}
	
	@GetMapping("/pets/{petId}")
	public Pet getPet(@PathVariable int petId){
		
			Pet thePet = petCareService.findById(petId);
			
			if(thePet == null) {
				throw new PetNotFoundException("Pet Not Found - " + petId);
			}
			
			return thePet;
	}
	
	@PostMapping("/pets")
	public Pet addPet(@RequestBody Pet thePet) {
				
		thePet.setId(0);

		petCareService.save(thePet);
		
		return thePet;
	}
	
	
	@PutMapping("/pets")
	public Pet updatePet(@RequestBody Pet thePet) {
		
		petCareService.save(thePet);
		
		return thePet;
	}
		
	@DeleteMapping("/pets/{petId}")
	public String deletePet(@PathVariable int petId) {
		
		Pet tempPet = petCareService.findById(petId);
		 		
		if (tempPet == null) {
			throw new RuntimeException("Employee id not found - " + petId);
		}
		
		petCareService.deleteById(petId);
		
		return "Deleted pet id - " + petId;
	}
	
}

