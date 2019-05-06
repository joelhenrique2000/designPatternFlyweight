package model;

import model.impl.Movimento;

public class IrEsquerda implements Movimento {

	@Override
	public String executaMovimento() {
		return "Movendo bloco para esquerda";
	}
	
}
