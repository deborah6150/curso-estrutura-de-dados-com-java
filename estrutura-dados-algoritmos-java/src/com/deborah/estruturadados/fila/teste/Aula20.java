package com.deborah.estruturadados.fila.teste;

import com.deborah.estruturadados.fila.Fila;

public class Aula20 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		
		fila.enfilerar(1);
		fila.enfilerar(2);
		fila.enfilerar(3);
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		
		System.out.println(fila.toString());
	}

}
