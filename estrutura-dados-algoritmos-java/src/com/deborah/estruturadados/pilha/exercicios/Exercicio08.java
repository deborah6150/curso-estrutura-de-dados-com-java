package com.deborah.estruturadados.pilha.exercicios;

import java.util.Stack;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Stack<Integer> original = new Stack<>();
		Stack<Integer> des = new Stack<>();
		Stack<Integer> aux = new Stack<>();

		
		original.push(3);
		original.push(2);
		original.push(1);
		
		torreDeHanoi(original.size(), original, des, aux);
	}

	public static void torreDeHanoi(int n, Stack<Integer> original, Stack<Integer> des, Stack<Integer> aux) {
	
		if(n > 0) {
			torreDeHanoi(n-1, original, aux, des);
			des.push(original.pop());
			System.out.println("------");
			System.out.println("Original: " + original);
			System.out.println("Destino: " + des);
			System.out.println("Aux: " + aux);
			torreDeHanoi(n-1, aux, des, original);
		}
	}
}
