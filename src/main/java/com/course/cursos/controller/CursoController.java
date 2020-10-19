package com.course.cursos.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.course.commons.controller.CommonsController;
import com.course.cursos.service.CursoService;
import com.course.entity.Alumno;
import com.course.entity.Curso;

@RestController
public class CursoController extends CommonsController<Curso, CursoService>{
	
	

	@GetMapping(path = "/test")
	public ResponseEntity<String> methodTest(){
		return new ResponseEntity<String>("TESTING", HttpStatus.OK);
	}
	
	@GetMapping(path = "/{idAlumno}/curso")
	public ResponseEntity<Curso> getCursoByAlumnoId(@PathVariable Long alumnoId){
		
		Curso curso = service.getCursoByAlumnoId(alumnoId);
		if (null != curso) {
			return new ResponseEntity<Curso>(curso, HttpStatus.OK);
		}
		return new ResponseEntity<Curso>(HttpStatus.NO_CONTENT);
	}
	
	
	@PutMapping(path = "/{idCurso}/alumnos")
	public ResponseEntity<Curso> updateCurso(@PathVariable Long idCurso, @RequestBody List<Alumno> alumnos){
		
		Curso curso = service.findById(idCurso).orElse(null);
		if (null != curso) {
			if (null != alumnos && !alumnos.isEmpty()) {
				
				alumnos.stream().forEach(alumno -> curso.addAlumnos(alumno));
				service.update(curso);
				return new ResponseEntity<Curso>(curso, HttpStatus.CREATED);
			}
		}
		return new ResponseEntity<Curso>(HttpStatus.NOT_FOUND);
		
	}

}
