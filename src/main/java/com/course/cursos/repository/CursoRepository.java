package com.course.cursos.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.course.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long>{
	
	@Query("select c from Curso c join fetch c.alumnos a where a.idAlumno = ?1")
	public Curso getCursoByAlumnoId(Long alumnoId);

}
