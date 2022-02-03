package com.deborah.estruturadados.pilha.teste;

import java.util.Stack;

import com.deborah.estruturadados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>();
		
		Stack<Integer> stack = new Stack<>();
		
		System.out.println(stack.isEmpty());
		
		stack.push(1);//push empilha
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.isEmpty());//verifica se a pilha esta fazia
		
		System.out.println(stack.size());
		System.out.println(stack);
		
		System.out.println(stack.peek());//verifica quantos elementos tem na pilha
		
		System.out.println(stack.pop());//desempilha
		
		System.out.println(stack);
		

	}

}
