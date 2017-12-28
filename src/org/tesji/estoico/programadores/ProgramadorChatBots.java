package org.tesji.estoico.programadores;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.tesji.estoico.profesiones.Programador;

public class ProgramadorChatBots extends Programador {

	private static final Logger LOG = Logger.getLogger(ProgramadorChatBots.class.getName());

	@Override
	public void programar() {
		programarChatBots();

	}

	private void programarChatBots() {
		LOG.info("Programador ChatBots");
		LOG.info("Programando con Phyton");
		LOG.info("Programando con JS");
		LOG.info("Desarrollo de apis con apiary.io");

		conocimientos = new ArrayList<>();
		conocimientos.add("Inteligencia Artificial");
		conocimientos.add("Mongo DB");
		conocimientos.add("Matematicas Aplicadas");

	}

}
