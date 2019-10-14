package com.techwaves.petcare.doa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techwaves.petcare.model.*;

public interface PetRepository extends JpaRepository<Pet, Integer> {
	
	//Methods of the JpaRepository can be used now in the service class........
	
	// add a method to sort by last name
	
//	public List<Pet> findAllByOrderByLastNameAsc();

}
