package com.practica.microservicios.commons.app.examenes.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practica.microservicios.commons.app.examenes.models.repository.AsignaturaRepository;
import com.practica.microservicios.commons.app.examenes.models.repository.ExamenRepository;
import com.practica.microservicios.commons.examenes.models.entity.Asignatura;
import com.practica.microservicios.commons.examenes.models.entity.Examen;
import com.practica.microservicios.commons.services.CommonServiceImpl;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements ExamenService {

	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Examen> findByNombre(String term) {
		return repository.findByNombre(term);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Asignatura> findAllAsignaturas() {
		return asignaturaRepository.findAll();
	}

	
}
