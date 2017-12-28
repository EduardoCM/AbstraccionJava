package org.tesji.estoico.profesiones;

import java.util.List;
import java.util.logging.Logger;


public abstract class Programador {
	private static final Logger LOG = Logger.getLogger(Programador.class.getName());

	
	protected List<String> conocimientos;
	protected List<String> certificaciones;
	protected List<String> proyectos;
	
	public abstract void programar();
	
	
	public void verConocimientos(){
		LOG.info("Conocimientos: " + conocimientos);
	}
	
	public void verProyectos(){
		LOG.info("Proyectos: " + proyectos);
	}
	
	public void verCertificaciones(){
		LOG.info("Certificaciones: " + certificaciones);
	}
	

}
