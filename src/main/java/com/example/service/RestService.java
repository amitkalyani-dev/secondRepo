package com.example.service;

import org.springframework.stereotype.Service;

import com.example.data.Employee;

@Service
public class RestService {

	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeId("1234");
		employee.setName("Amit");
		return employee;
	}
}
