package com.example.report.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PROJECT")
public class ProjectTo {

	@Id
	@Column(name = "PROJECT_ID")
	private String projectId;
	private String projectName;
	private String manager;
	@OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
	private Set<EmployeeTo> employees;
}
