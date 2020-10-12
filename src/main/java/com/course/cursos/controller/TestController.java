package com.course.cursos.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.commons.controller.CommonsController;
import com.course.cursos.service.CursoService;
import com.course.entity.Curso;

@RestController
public class TestController extends CommonsController<Curso, CursoService>{
	
	

	@GetMapping(path = "/test")
	public ResponseEntity<String> methodTest(){
		return new ResponseEntity<String>("TESTING", HttpStatus.OK);
	}

}
