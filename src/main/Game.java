package main;

import java.util.Arrays;
import java.util.List;

import model.Impulsionar;
import model.IrDireita;
import model.IrEsquerda;
import model.Movimentos;
import model.impl.Movimento;

public class Game {
	public static void main(String args[]) {
		
		Movimentos movimentos = new Movimentos();
		
		List <Movimento> movimentosExecutado = Arrays.asList(movimentos.get("irEsquerda"), movimentos.get("irEsquerda"),
				movimentos.get("Impulsionar"), movimentos.get("irDireita"), movimentos.get("irEsquerda"));
		
		for(Movimento movimento : movimentosExecutado) {
			System.out.println(movimento);
		}
	}
}
