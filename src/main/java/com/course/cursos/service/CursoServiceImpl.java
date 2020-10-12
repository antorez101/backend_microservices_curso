package com.course.cursos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.commons.service.CommonsServiceImpl;
import com.course.cursos.repository.CursoRepository;
import com.course.entity.Curso;

@Service
public class CursoServiceImpl extends CommonsServiceImpl<Curso, CursoRepository> implements CursoService{
	
	@Autowired
	CursoService service;
	
	@Override
	public Curso update(Curso curso) {
		
		Optional<Curso> cursodb = null;
		if (null != curso) {
			cursodb = service.findById(curso.getCursoId());
			if (cursodb.isPresent()) {
				cursodb.get().setNameCurso(curso.getNameCurso());
				service.update(cursodb.get());
				return cursodb.get();
			}
		}
		
		return null;
	}

}
