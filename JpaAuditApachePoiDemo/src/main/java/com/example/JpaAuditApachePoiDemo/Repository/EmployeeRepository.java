package com.example.JpaAuditApachePoiDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JpaAuditApachePoiDemo.Entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
