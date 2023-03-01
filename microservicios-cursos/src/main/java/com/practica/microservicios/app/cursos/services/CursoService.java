package com.practica.microservicios.app.cursos.services;

import com.practica.microservicios.app.cursos.models.entity.Curso;
import com.practica.microservicios.commons.services.CommonService;

public interface CursoService extends CommonService<Curso> {

	public Curso findCursoById(Long id);
}
