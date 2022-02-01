package com.deborah.estruturadados.vetor.exercicios;

import java.util.ArrayList;
import java.util.Scanner;


import com.deborah.estruturadados.vetor.teste.Contato;

public class Exercicio07  extends Exercicio06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Contato> lista = new ArrayList<Contato>(20);
		
		criarContatosDinamicamente(5, lista);


		int opcao = 1;
		while(opcao != 0) {
			opcao = ObterOpcaoMenu(scan);

			switch (opcao) {
			case 1: 
				adicionaContatoFinal(scan, lista);
				break;
			case 2:
				adicionarContatoPosicao(scan, lista);
				break;
			case 3:
				obtemContatoPosicao(scan, lista);
				break;
			case 4:
				obtemContato(scan, lista);
				break;
			
			case 5:
				pesquisarUltimoIndice(scan, lista);
				break;
			case 6:
				pesquisarContatoExiste(scan, lista);
				break;
			case 7:
				excluirPorPosicao(scan, lista);
				break;
			case 8:
				excluirContato(scan, lista);
				break;
			case 9:
				imprimirTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;
			case 0:
				break;
			default:
				break;
			}


		}

		System.out.println("Usuario digitou 0 programa encerrado");
	}


	protected static void adicionaContatoFinal(Scanner scan, ArrayList<Contato> lista) {

		System.out.println("Criando um contato, entre com as informacoes: \n\n");
		String nome = lerInformacao("Entre com nome", scan);
		String telefone = lerInformacao("Entre com telefone", scan);
		String email = lerInformacao("Entre com email", scan);

		Contato contato = new Contato(nome, telefone, email);
		lista.add(contato);

		System.out.println("Contato adicionando com sucesso");
		System.out.println(contato);
	}

	protected static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

		System.out.println("Criando um contato, entre com as informacoes: \n\n");
		String nome = lerInformacao("Entre com nome", scan);
		String telefone = lerInformacao("Entre com telefone", scan);
		String email = lerInformacao("Entre com email", scan);

		Contato contato = new Contato(nome, telefone, email);

		int pos = lerInformacaoInt("Entre com a posicao para adicionar o contato", scan);

		try {
			lista.add(pos,contato);

			System.out.println("Contato adicionando com sucesso");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posicao invalida, contato nao adicionado");
		}

	}

	protected static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista){

		int pos = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {

			Contato contato = lista.get(pos);

			System.out.println("Contato existe, segue os dados do contato");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posicao invalida!");
		}

	}
	
	protected static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista){

		int pos = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {

			Contato contato = lista.get(pos);

			System.out.println("Contato existe, segue os dados do contato");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do ultimo indice do contato encotrado: ");
			pos = lista.lastIndexOf(contato);
			
			System.out.println("Contato encontrado na posicao" + pos);

		} catch (Exception e) {
			System.out.println("Posicao invalida!");
		}

	}
	
	protected static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista){

		int pos = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {

			Contato contato = lista.get(pos);


			boolean existe =lista.contains(contato);
			
			if(existe) {
				System.out.println("Contato existe, segue os dados do contato");
				System.out.println(contato);
			} else {
				System.out.println("Contato nao existe");
			}
			
			System.out.println("Contato encontrado na posicao" + pos);

		} catch (Exception e) {
			System.out.println("Posicao invalida!");
		}

	}
	
	protected static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista){

		int pos = lerInformacaoInt("Entre com a posicao a ser removida", scan);

		try {

			lista.remove(pos);
			System.out.println("Contato excluido!");
			

		} catch (Exception e) {
			System.out.println("Posicao invalida!");
		}

	}
	
	protected static void excluirContato(Scanner scan, ArrayList<Contato> lista){

		int pos = lerInformacaoInt("Entre com o contato a ser removido", scan);

		try {
			
			Contato contato = lista.get(pos);

			lista.remove(contato);
			System.out.println("Contato excluido!");
			

		} catch (Exception e) {
			System.out.println("Posicao invalida!");
		}

	}
	
	protected static void imprimirTamanhoVetor(ArrayList<Contato> lista) {
		System.out.println("Tamanho do vetor e de: " + lista.size());
	}
	
	protected static void limparVetor(ArrayList<Contato> lista) {
		lista.clear();
		System.out.println("Todos os contatos do vetor foram excluido!");
	}
	
	protected static void imprimirVetor(ArrayList<Contato> lista) {
		System.out.println(lista);
	}
	

	protected static void obtemContato(Scanner scan, ArrayList<Contato> lista){

		int pos = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {

			Contato contato = lista.get(pos);

			System.out.println("Contato existe, segue os dados do contato");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encotrado: ");
			pos = lista.indexOf(contato);
			System.out.println("Contato encontrado na posicao" + pos);

		} catch (Exception e) {
			System.out.println("Posicao invalida!");
		}

	}

	
	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {

		Contato contato;

		for(int i=1; i<=quantidade; i++) {

			contato = new Contato();
			contato.setNome("Contato 1" + i); 
			contato.setTelefone("111111" + i);
			contato.setEmail("contato1@gmail.com" + i);

			lista.add(contato);
		}
	}
}
