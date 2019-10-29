package com.techwaves.petcare.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pet")
public class Pet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="gender")
	private String gender; 
	
	@Column(name="type")
	private String type;
	
	@Column(name="species")
	private String species; 
	
	@Column(name="heightft")
	private int heightft;
	
	@Column(name="heightin")
	private int heightin; 
	
	@Column(name="weight")
	private int  weight;
	
	@Column(name="age")
	private int  age;
	
	@Column(name="ownername")
	private String ownerName;
	
	@Column(name="address")
	private String address; 
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="primaryvet")
	private String primaryVet; 
	
	@Column(name="primaryvetphone")
	private String primaryVetPhone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getHeightft() {
		return heightft;
	}

	public void setHeightft(int heightft) {
		this.heightft = heightft;
	}

	public int getHeightin() {
		return heightin;
	}

	public void setHeightin(int heightin) {
		this.heightin = heightin;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPrimaryVet() {
		return primaryVet;
	}

	public void setPrimaryVet(String primaryVet) {
		this.primaryVet = primaryVet;
	}

	public String getPrimaryVetPhone() {
		return primaryVetPhone;
	}

	public void setPrimaryVetPhone(String primaryVetPhone) {
		this.primaryVetPhone = primaryVetPhone;
	}

		
}

