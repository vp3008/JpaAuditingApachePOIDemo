package com.example.JpaAuditApachePoiDemo.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JpaAuditApachePoiDemo.Entities.Employee;
import com.example.JpaAuditApachePoiDemo.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees()
	{
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees :: add);
		return employees;
	}
	
	public Employee getEmployee(int id)
	{
		return employeeRepository.findById(id).get();		
	}
	
	public void updateEmployee(Employee employee)
	{
		employeeRepository.save(employee);
	}
	@Transactional
	public void addEmployee(Employee employee)
	{
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(int id)
	{
		employeeRepository.deleteById(id);
	}

	public void deleteAllEmployees() {
		employeeRepository.deleteAll();
		
	}
}
