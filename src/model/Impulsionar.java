package model;

import model.impl.Movimento;

public class Impulsionar implements Movimento {

	@Override
	public String executaMovimento() {
		return "Impulsionando bloco";
	}

}
