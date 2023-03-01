package com.practica.microservicios.app.cursos.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practica.microservicios.app.cursos.models.entity.Curso;
import com.practica.microservicios.app.cursos.models.repository.CursoRepository;
import com.practica.microservicios.commons.services.CommonServiceImpl;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {

	@Override
	@Transactional(readOnly = true)
	public Curso findCursoById(Long id) {
		return repository.findCursoById(id);
	}


}
