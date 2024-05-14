package com.librarymanagmentsystem.librarymanagmentsystem.api.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;


import lombok.Getter;

import lombok.Setter;

@Getter
@Setter
@Entity
public class Patron {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer patronId;

	@Column(length = 100, nullable = false)
	private String patronName;
	
	@Column(length = 100, nullable = false)
	private String patronAddress;
	
	@Size(max = 10,min = 10, message = "Phone should be 10 Digit")
	private String patronContact;
	
	@Email(message = "Enter Correct Email Format")
	private String patronEmail;
	
}
