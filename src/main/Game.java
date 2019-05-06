package main;

import java.util.Arrays;
import java.util.List;

import model.Impulsionar;
import model.IrDireita;
import model.IrEsquerda;
import model.impl.Movimento;

public class Game {
	public static void main(String args[]) {
		
		List <Movimento> movimentos = Arrays.asList(new IrEsquerda(), new IrEsquerda(),
				new Impulsionar(), new IrDireita(), new IrEsquerda());
		
		for(Movimento movimento : movimentos) {
			System.out.println(movimento);
		}
	}
}
