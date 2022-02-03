package com.deborah.estruturadados.pilha.exercicios;

import java.util.Stack;

public class Exercicio04 {

	public static void main(String[] args) {

		Stack<Livro> stack = new Stack<Livro>();

		Livro livro1 = new Livro();
		livro1.setNome("nome1");
		livro1.setAnoLancamento(2022);
		livro1.setIsbn("isbn1");
		livro1.setAutor("autor1");

		Livro livro2 = new Livro();
		livro2.setNome("nome2");
		livro2.setAnoLancamento(2022);
		livro2.setIsbn("isbn2");
		livro2.setAutor("autor2");

		Livro livro3 = new Livro();
		livro3.setNome("nome3");
		livro3.setAnoLancamento(2022);
		livro3.setIsbn("isbn3");
		livro3.setAutor("autor3");

		Livro livro4 = new Livro();
		livro4.setNome("nome4");
		livro4.setAnoLancamento(2022);
		livro4.setIsbn("isbn4");
		livro4.setAutor("autor4");

		Livro livro5 = new Livro();
		livro5.setNome("nome5");
		livro5.setAnoLancamento(2022);
		livro5.setIsbn("isbn5");
		livro5.setAutor("autor5");

		Livro livro6 = new Livro();
		livro6.setNome("nome6");
		livro6.setAnoLancamento(2022);
		livro6.setIsbn("isbn6");
		livro6.setAutor("autor6");

		System.out.println("Pilha de livros criada, stack vazia?" + stack.isEmpty());

		System.out.println("Emstackndo livros na stack");

		stack.push(livro1);
		stack.push(livro2);
		stack.push(livro3);
		stack.push(livro4);
		stack.push(livro5);
		stack.push(livro6);

		System.out.println(stack.size() + "livros foram empilhados ");
		System.out.println(stack);

		System.out.println("Pilha de livros criada, pilha vazia?" + stack.isEmpty());

		System.out.println("Espiando o topo da pilha" + stack.peek());

		System.out.println("Desempilhando livros na pilha");

		while (!stack.isEmpty()) {

			System.out.println("Desempilhando livros da pilha" + stack.pop());

		}
		System.out.println("Todos os livros foram Desempilhando" + stack.isEmpty());

	}

}
