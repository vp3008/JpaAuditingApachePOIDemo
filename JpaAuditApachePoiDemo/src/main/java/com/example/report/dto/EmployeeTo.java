package com.example.report.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE")
public class EmployeeTo {

	@Id
	@GeneratedValue
	private int emp_id;
	private String name;
	private String designation;
	private float experience;
	private String isActive;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PROJECT_ID")
	private ProjectTo project;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "OFFICIALE_MAIL")
	private ContactDetailsTo contactDetails;

}
