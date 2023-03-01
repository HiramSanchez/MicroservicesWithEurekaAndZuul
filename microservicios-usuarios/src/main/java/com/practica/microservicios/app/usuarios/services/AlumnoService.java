package com.practica.microservicios.app.usuarios.services;

import java.util.List;

import com.practica.microservicios.commons.alumnos.models.entity.Alumno;
import com.practica.microservicios.commons.services.CommonService;


public interface AlumnoService extends CommonService<Alumno> {
	
	public List<Alumno> findByNombreOrApellido(String term);
}
