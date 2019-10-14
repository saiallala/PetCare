package com.techwaves.petcare.doa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.techwaves.petcare.model.*;


@CrossOrigin(origins = "http://localhost:4200")
public interface PetRepository extends JpaRepository<Pet, Integer> {
	
	//Methods of the JpaRepository can be used now in the service class........
	
	// add a method to sort by last name
	
//	public List<Pet> findAllByOrderByLastNameAsc();

}
