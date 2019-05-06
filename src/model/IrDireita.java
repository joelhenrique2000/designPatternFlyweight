package model;

import model.impl.Movimento;

public class IrDireita implements Movimento {
	
	@Override
	public String executaMovimento() {
		return "Movendo bloco para direita";
	}
}
