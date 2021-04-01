package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bus2;
import com.example.demo.repository.bus2repo;



@RestController
public class Bus2Controller {
	@Autowired
	private bus2repo employeeData;
	
	@RequestMapping(value = "/listPageable", method = RequestMethod.GET)
	Page<Bus2> employeesPageable(Pageable pageable) {
		return employeeData.findAll(pageable);

	}
}