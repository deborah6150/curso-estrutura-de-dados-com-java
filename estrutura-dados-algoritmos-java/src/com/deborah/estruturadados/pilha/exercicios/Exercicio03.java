package com.deborah.estruturadados.pilha.exercicios;

import com.deborah.estruturadados.pilha.Pilha;

public class Exercicio03 {

	public static void main(String[] args) {

		Pilha<Livro> pilha = new Pilha<>(20);

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


		System.out.println("Pilha de livros criada, pilha vazia?" + pilha.estaVazia());

		System.out.println("Empilhando livros na pilha");

		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		pilha.empilha(livro5);
		pilha.empilha(livro6);

		System.out.println(pilha.tamanho() + "livros foram empilhados ");
		System.out.println(pilha);

		System.out.println("Pilha de livros criada, pilha vazia?" + pilha.estaVazia());
		
		System.out.println("Espiando o topo da pilha" + pilha.topo());

		System.out.println("Desempilhando livros na pilha");

		while(!pilha.estaVazia()) {

			System.out.println("Desempilhando livros da pilha" + pilha.desempilha());

		}
		System.out.println("Todos os livros foram desempilhados" + pilha.estaVazia());

	}
}
