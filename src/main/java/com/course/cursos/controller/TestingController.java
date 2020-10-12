package com.course.cursos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {
	
	@GetMapping(path = "/testingagain")
	public ResponseEntity<String> methodTest(){
		return new ResponseEntity<String>("TESTING", HttpStatus.OK);
	}

}
