package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.Employee;
import com.example.service.RestService;

@RestController
@RequestMapping(value = "/rest")
public class RestServiceController {

	private RestService restService;
	
	@Autowired
	public RestServiceController (RestService restService) {
		this.restService = restService;
		}
	
	
	@GetMapping(value = "/result")
	public ResponseEntity<Employee> result() {
		Employee employee = restService.getEmployee();
		ResponseEntity<Employee> responseEntity = new ResponseEntity<>(employee, HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping(value = "/result2")
	public String result2() {
		return "Success!";
	}
	
	
}

