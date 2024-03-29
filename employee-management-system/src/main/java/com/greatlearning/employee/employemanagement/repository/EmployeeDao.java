package com.greatlearning.employee.employemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.employee.employemanagement.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
	List<Employee> findEmployeeByFirstName(String firstName);

}
