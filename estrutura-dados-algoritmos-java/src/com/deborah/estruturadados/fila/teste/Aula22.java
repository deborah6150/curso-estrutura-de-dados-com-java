package com.deborah.estruturadados.fila.teste;

import com.deborah.estruturadados.fila.Fila;

public class Aula22 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();

		fila.enfilerar(1);
		fila.enfilerar(2);
		fila.enfilerar(3);

		System.out.println(fila);
		
		System.out.println(fila.desenfilerar());
		
		System.out.println(fila.toString());
	}

}
