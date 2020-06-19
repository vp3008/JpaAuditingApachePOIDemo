package com.example.JpaAuditApachePoiDemo.Entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;


@Data
@Entity
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "projectName")
public class Project {

	@Id
	private String projectName;
	private String manager;
	
	@OneToMany(mappedBy = "project")
	private Set<Employee> employees;
}
