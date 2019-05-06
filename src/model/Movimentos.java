package model;

import java.util.HashMap;
import java.util.Map;

import model.impl.Movimento;

public class Movimentos {
	private static Map<String, Movimento> movimentos = new HashMap<>();
		
	static {
		movimentos.put("irDireita", new IrDireita());
		movimentos.put("irEsquerda", new IrEsquerda());
		movimentos.put("Impulsionar", new Impulsionar());
	}
	
	public static Movimento get(String nome) {
		return movimentos.get(nome);
	}
}
