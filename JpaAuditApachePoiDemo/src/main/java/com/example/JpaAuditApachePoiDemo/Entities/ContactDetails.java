package com.example.JpaAuditApachePoiDemo.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;


@Data
@Entity
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "officialEmail")
public class ContactDetails {
	
	private long phone1;
	private long phone2;
	@Id
	private String officialEmail;
	private String personalEmail;
	
	@OneToOne(mappedBy = "contactDetails")
	private Employee employee;

}
