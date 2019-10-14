package com.techwaves.petcare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techwaves.petcare.doa.PetRepository;
import com.techwaves.petcare.model.Pet;

@Service
public class PetCareService {

		private PetRepository petRepository;
		
		@Autowired
		public PetCareService (PetRepository thePetRepository){
			
			petRepository = thePetRepository;
		}
		
		public List<Pet> findAll() {
		
//			return petRepository.findAllByOrderByLastNameAsc();
			return petRepository.findAll();
		}
		
		public Pet findById(int theId) {
			
			Optional<Pet> result = petRepository.findById(theId);
			
			Pet thePet = null;
			
			if(result.isPresent()) {
				thePet = result.get();
			}
			
			else {
				throw new RuntimeException("We didn't find Pet Id - " + theId);
			}
			
			return thePet;

		}

		public void save(Pet thePet) {
			
			petRepository.save(thePet);

		} 


		public void deleteById(int theId) {
			
			petRepository.deleteById(theId);;

		}
		
	}

