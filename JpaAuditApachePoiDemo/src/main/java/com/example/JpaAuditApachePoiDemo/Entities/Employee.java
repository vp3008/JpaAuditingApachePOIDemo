package com.example.JpaAuditApachePoiDemo.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Data
@Entity
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String designation;
	private float experience;
	private String isActive;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "projectName")
	private Project project;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "officialEmail")
	private ContactDetails contactDetails;

}
