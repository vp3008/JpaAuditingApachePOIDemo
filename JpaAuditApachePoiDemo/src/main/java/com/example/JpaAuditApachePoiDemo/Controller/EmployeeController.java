package com.example.JpaAuditApachePoiDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JpaAuditApachePoiDemo.Entities.Employee;
import com.example.JpaAuditApachePoiDemo.Service.EmployeeService;

@RestController
@RequestMapping("/employeedb")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		return employeeService.getEmployee(id);
	}
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employees")
	public void updateEmployee(@RequestBody Employee employee)
	{
		employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable int id)
	{
		employeeService.deleteEmployee(id);
	}
	
	@DeleteMapping("/employees")
	public void deleteAllEmployees()
	{
		employeeService.deleteAllEmployees();
	}
}
