package com.deborah.estruturadados.pilha.teste;

import com.deborah.estruturadados.pilha.Pilha;

public class Aula16 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>();
		
		System.out.println(pilha.topo());
		
		System.out.println(pilha);
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		pilha.empilha(4);
		
		System.out.println(pilha);
		
		System.out.println(pilha.topo());

	}

}
