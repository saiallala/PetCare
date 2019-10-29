package com.techwaves.petcare.mapper;

import org.springframework.stereotype.Component;

import com.techwaves.petcare.dto.PetDTO;
import com.techwaves.petcare.model.Pet;

@Component
public class PetMapper {

	public Pet toEntity(PetDTO dto) {
		Pet pet = new Pet();
		pet.setId(dto.getId());
		pet.setName(dto.getName());
		pet.setGender(dto.getGender());
		pet.setType(dto.getType());
		pet.setSpecies(dto.getSpecies());
		pet.setHeightft(dto.getHeightft());
		pet.setHeightin(dto.getHeightin());
		pet.setWeight(dto.getWeight());
		pet.setAge(dto.getAge());
		pet.setOwnerName(dto.getOwnerName());
		pet.setAddress(dto.getAddress());
		pet.setPhone(dto.getPhone());
		pet.setPrimaryVet(dto.getPrimaryVet());
		pet.setPrimaryVetPhone(dto.getPrimaryVetPhone());
		return pet;
	}
	public PetDTO toDTO(Pet entity) {
		PetDTO pet = new PetDTO();
		
		pet.setId(entity.getId());
		pet.setName(entity.getName());
		pet.setGender(entity.getGender());
		pet.setType(entity.getType());
		pet.setSpecies(entity.getSpecies());
		pet.setHeightft(entity.getHeightft());
		pet.setHeightin(entity.getHeightin());
		pet.setWeight(entity.getWeight());
		pet.setAge(entity.getAge());
		pet.setOwnerName(entity.getOwnerName());
		pet.setAddress(entity.getAddress());
		pet.setPhone(entity.getPhone());
		pet.setPrimaryVet(entity.getPrimaryVet());
		pet.setPrimaryVetPhone(entity.getPrimaryVetPhone());
		return pet;
	}
}
