package org.tesji.estoico.programadores;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.tesji.estoico.profesiones.Programador;

public class ProgramadorJava extends Programador {

	private static final Logger LOG = Logger.getLogger(ProgramadorJava.class.getName());
	
	
	private List<String> frameworks;

	@Override
	public void programar() {
		programarJava();
	}

	
	private void programarJava() {
		LOG.info("Programando en Java");
		conocimientos = new ArrayList<>();
		conocimientos.add("BD Oracle");
		conocimientos.add("DevOps");
		conocimientos.add("Integracion Continua");
		conocimientos.add("Scrum");
	}
	
	
	public void verFrameworksManeja(){
		LOG.info("Frameworks: " + frameworks);
	}

}
