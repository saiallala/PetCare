package com.techwaves.petcare.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techwaves.petcare.doa.PetRepository;
import com.techwaves.petcare.dto.PetDTO;
import com.techwaves.petcare.mapper.PetMapper;
import com.techwaves.petcare.model.Pet;

@Service
@Transactional
public class PetCareService {
		
		@Autowired
		private PetRepository petRepository;
		@Autowired
		private PetMapper petMapper;
		
//		@Autowired
//		public PetCareService (PetRepository thePetRepository, PetMapper thePetMapper) {
//			
//			petRepository = thePetRepository;
//			petMapper = thePetMapper;
//		}
//		
		//getAll
		public List<PetDTO> findAll() {
		
			List<Pet> findAllPets = null;
			findAllPets = petRepository.findAll();
			return findAllPets.stream().map(m -> petMapper.toDTO(m)).collect(Collectors.toList());
		}
		
		//get by Id
		public PetDTO findById(int theId) {
			
			Optional<Pet> result = petRepository.findById(theId);
			
			PetDTO thePet = null;
			
			if(result.isPresent()) {
				thePet = petMapper.toDTO(result.get());
			}
			
			else {
				throw new RuntimeException("We didn't find Pet Id - " + theId);
			}
			
			return thePet;

		}
		//Post
		public PetDTO save(PetDTO thePet) {
			Pet entity = petMapper.toEntity(thePet);
			Pet saved = petRepository.save(entity);
			return petMapper.toDTO(saved);

		} 

		//update
		
		//Delete
		public void deleteById(int theId) {
			
			petRepository.deleteById(theId);;

		}
		
	}

