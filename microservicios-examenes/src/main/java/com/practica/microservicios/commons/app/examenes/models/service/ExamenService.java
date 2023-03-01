package com.practica.microservicios.commons.app.examenes.models.service;

import java.util.List;

import com.practica.microservicios.commons.examenes.models.entity.Asignatura;
import com.practica.microservicios.commons.examenes.models.entity.Examen;
import com.practica.microservicios.commons.services.CommonService;

public interface ExamenService extends CommonService<Examen>{
	public List<Examen> findByNombre(String term);
	public Iterable<Asignatura> findAllAsignaturas();
}
