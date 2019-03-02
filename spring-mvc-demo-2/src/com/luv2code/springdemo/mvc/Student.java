package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> cityOptions;
	
	public LinkedHashMap<String, String> getCityOptions() {
		return cityOptions;
	}



	public Student() {
		cityOptions = new LinkedHashMap<>();
		//initialize the hash map
		cityOptions.put("COL","COLOMBO");
		cityOptions.put("KOT","KOTTAWA");
		cityOptions.put("NEG","NEGOMBO");
		cityOptions.put("MAT","MATHARA");
		cityOptions.put("HOR","HORANA");
	}




	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
