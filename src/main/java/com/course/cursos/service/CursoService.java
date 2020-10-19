package com.course.cursos.service;

import com.course.commons.service.CommonsService;
import com.course.entity.Curso;

public interface CursoService extends CommonsService<Curso>{
	
	public Curso getCursoByAlumnoId(Long alumnoId);

}
