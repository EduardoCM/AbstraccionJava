package org.tesji.estoico.main;

import java.util.logging.Logger;

import org.tesji.estoico.profesiones.Programador;
import org.tesji.estoico.programadores.ProgramadorChatBots;
import org.tesji.estoico.programadores.ProgramadorJava;
import org.tesji.estoico.programadores.ProgramadorMicrosoft;

public class TestAbstractClass {

	private static final Logger LOG = Logger.getLogger(TestAbstractClass.class.getName());

	public static void main(String[] args) {

		Programador programadorJava = new ProgramadorJava();
		Programador programadorChatbots = new ProgramadorChatBots();
		Programador programadorMicrosoft = new ProgramadorMicrosoft();

		LOG.info("=========================");
		programadorJava.programar();
		programadorJava.verConocimientos();

		LOG.info("=========================");
		programadorChatbots.programar();

		LOG.info("=========================");
		programadorMicrosoft.programar();
		programadorMicrosoft.verProyectos();

	}

}
