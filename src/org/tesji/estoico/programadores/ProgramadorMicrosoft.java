package org.tesji.estoico.programadores;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.tesji.estoico.profesiones.Programador;

public class ProgramadorMicrosoft extends Programador {

	private static final Logger LOG = Logger.getLogger(ProgramadorMicrosoft.class.getName());

	@Override
	public void programar() {
		programadorMicrosoft();
	}
	
	
	private void programadorMicrosoft(){
		LOG.info("Programador con .Net");
		proyectos = new ArrayList<>();
		proyectos.add("Desarrollo de video Juegos XBOX 360");
		proyectos.add("Desarrollo de sistemas en Space X y Tesla Motors");		
	}
	
	

}
