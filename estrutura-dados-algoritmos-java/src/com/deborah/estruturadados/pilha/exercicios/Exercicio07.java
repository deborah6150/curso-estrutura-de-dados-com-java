package com.deborah.estruturadados.pilha.exercicios;

import java.util.Stack;

public class Exercicio07 {

	public static void main(String[] args) {
		
		imprimeResultado(2);
		imprimeResultado(4);
		imprimeResultado(24);
		imprimeResultado(3);
		imprimeResultado(25);
	}

	public static void imprimeResultado(int numero){
		System.out.println(numero + " conversao em binario " + decimalBinario(numero));
	}
	
	public static String decimalBinario(int numero) {
		
		Stack<Integer> pilha = new Stack<>();
		
		String numBinario = "";
		int resto;
		
		while(numero >  0) {
			resto = numero % 2;
			pilha.push(resto);
			numero /= 2;
		}
		
		while(!pilha.isEmpty()) {
			numBinario += pilha.pop();
		}
		
		return numBinario;
	}
}
