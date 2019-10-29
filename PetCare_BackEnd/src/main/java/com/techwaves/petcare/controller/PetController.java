package com.techwaves.petcare.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techwaves.petcare.dto.PetDTO;
import com.techwaves.petcare.service.PetCareService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/petcare")
public class PetController {
	
	private final PetCareService petCareService;

	@Autowired
	public PetController(PetCareService thePetCareService) {
		petCareService = thePetCareService;
	}
		
	@GetMapping("/pets")
	public List<PetDTO> getPets(){
		
			return petCareService.findAll();
	}
	
	@GetMapping("/pets/{petId}")
	public ResponseEntity<PetDTO> getPet(@PathVariable int petId){
		
			PetDTO thePet = petCareService.findById(petId);
			
			if(thePet == null) {
				throw new PetNotFoundException("Pet Not Found - " + petId);
			}
			
			return ResponseEntity.ok(thePet);
	}
	
	@PostMapping("/pets")
	public ResponseEntity<PetDTO> addPet(@RequestBody @Valid PetDTO thePet) throws URISyntaxException{
				
		thePet.setId(0);

		PetDTO postPet = petCareService.save(thePet);
		
		return ResponseEntity.created(new URI("/petcare/pets/" + postPet.getId())).body(postPet);
	}
	
	
//	@PutMapping("/pets/{petId}")
//	public ResponseEntity<PetDTO> updatePet(@PathVariable int id,@RequestBody @Valid Pet thePet) {
//		
//		petCareService.update(thePet);
//		
//		return thePet;
//	}
		
	@DeleteMapping("/pets/{petId}")
	public ResponseEntity<Void> deletePet(@PathVariable int petId) {
		
		PetDTO tempPet = petCareService.findById(petId);
		 		
		if (tempPet == null) {
			throw new RuntimeException("Employee id not found - " + petId);
		}
		
		petCareService.deleteById(petId);
		
		return ResponseEntity.ok().build();
	}
	
}

