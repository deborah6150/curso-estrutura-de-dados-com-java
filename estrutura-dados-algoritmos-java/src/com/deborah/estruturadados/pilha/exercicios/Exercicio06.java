package com.deborah.estruturadados.pilha.exercicios;

import com.deborah.estruturadados.pilha.Pilha;

public class Exercicio06 {

	public static void main(String[] args) {
		
		imprimeResultado("A + B");
		imprimeResultado("A + B + (C - D)");
		
		imprimeResultado("{[()]} () [] {}");
		
		imprimeResultado("{[(}} () [ {}");

	}
	
	public static void imprimeResultado(String expressao){
		System.out.println(expressao + " esta balanceado " + verificaSimbolosBalanceados(expressao));
	}
	
	final static String ABRE = "({[";
	final static String FECHA = ")}]";
	
	public static boolean verificaSimbolosBalanceados(String expressao) {
		
		boolean balanceado = true;
		
		Pilha<Character> pilha = new Pilha<Character>();
		
		char simbolo, topo;
		
		for (int i=0; i<expressao.length(); i++){
			simbolo = expressao.charAt(i);
			
			if(ABRE.indexOf(simbolo) > -1) {
				pilha.empilha(simbolo);
			}
			else if (FECHA.indexOf(simbolo) > -1) {
				
				if(pilha.estaVazia()) {
					return false;
				}
				else {
					topo = pilha.desempilha();
					
					if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}
				}
			}
		}
		
		return true;
	}

}
