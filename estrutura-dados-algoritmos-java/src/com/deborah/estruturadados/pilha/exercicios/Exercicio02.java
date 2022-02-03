package com.deborah.estruturadados.pilha.exercicios;

import java.util.Scanner;

import com.deborah.estruturadados.pilha.Pilha;

public class Exercicio02 {

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<>();

		Pilha<Integer> impar = new Pilha<>();

		Scanner scan = new Scanner(System.in);

		for(int i=1; i<=10; i++) {

			System.out.println("Entre com um numero: \n\n");
			int num = scan.nextInt();

			if(num == 0) {

				//Pilha par

				Integer desempilhado = par.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha par esta vazia :(");
				} else {
					System.out.println("Desempilhando da pilha par" + desempilhado);
				}

				//Pilha impar

				desempilhado = impar.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha impar esta vazia :(");
				} else {
					System.out.println("Desempilhando da pilha impar" + desempilhado);
				}

			}else if (num % 2 == 0) {
				System.out.println("Numero par Empilhando o numero " + num);
				par.empilha(num);
			} else {
				System.out.println("Numero impar Empilhando o numero " + num);
				impar.empilha(num);

			}
		}

		System.out.println("Desempilhando todos numeros da pilha par");

		while(!par.estaVazia()) {

			System.out.println("Desempilhando da pilha par" + par.desempilha());

		}
		while(!impar.estaVazia()) {

			System.out.println("Desempilhando da pilha impar" + impar.desempilha());

		}
		

	}

}
