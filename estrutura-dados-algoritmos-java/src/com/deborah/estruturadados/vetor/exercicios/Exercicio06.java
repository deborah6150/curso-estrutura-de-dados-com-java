package com.deborah.estruturadados.vetor.exercicios;

import java.util.Scanner;

import com.deborah.estruturadados.vetor.Lista;
import com.deborah.estruturadados.vetor.teste.Contato;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Lista<Contato> lista = new Lista<Contato>(20);
		
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


	private static void adicionaContatoFinal(Scanner scan, Lista<Contato> lista) {

		System.out.println("Criando um contato, entre com as informacoes: \n\n");
		String nome = lerInformacao("Entre com nome", scan);
		String telefone = lerInformacao("Entre com telefone", scan);
		String email = lerInformacao("Entre com email", scan);

		Contato contato = new Contato(nome, telefone, email);
		lista.adiciona(contato);

		System.out.println("Contato adicionando com sucesso");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {

		System.out.println("Criando um contato, entre com as informacoes: \n\n");
		String nome = lerInformacao("Entre com nome", scan);
		String telefone = lerInformacao("Entre com telefone", scan);
		String email = lerInformacao("Entre com email", scan);

		Contato contato = new Contato(nome, telefone, email);

		int pos = lerInformacaoInt("Entre com a posicao para adicionar o contato", scan);

		try {
			lista.adiciona(pos,contato);

			System.out.println("Contato adicionando com sucesso");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posicao invalida, contato nao adicionado");
		}

	}

	private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista){

		int pos = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {

			Contato contato = lista.busca(pos);

			System.out.println("Contato existe, segue os dados do contato");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posicao invalida!");
		}

	}
	
	private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista){

		int pos = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {

			Contato contato = lista.busca(pos);

			System.out.println("Contato existe, segue os dados do contato");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do ultimo indice do contato encotrado: ");
			pos = lista.ultimoIndice(contato);
			
			System.out.println("Contato encontrado na posicao" + pos);

		} catch (Exception e) {
			System.out.println("Posicao invalida!");
		}

	}
	
	private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista){

		int pos = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {

			Contato contato = lista.busca(pos);


			boolean existe =lista.contem(contato);
			
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
	
	private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista){

		int pos = lerInformacaoInt("Entre com a posicao a ser removida", scan);

		try {

			lista.remove(pos);
			System.out.println("Contato excluido!");
			

		} catch (Exception e) {
			System.out.println("Posicao invalida!");
		}

	}
	
	private static void excluirContato(Scanner scan, Lista<Contato> lista){

		int pos = lerInformacaoInt("Entre com o contato a ser removido", scan);

		try {
			
			Contato contato = lista.busca(pos);

			lista.remove(contato);
			System.out.println("Contato excluido!");
			

		} catch (Exception e) {
			System.out.println("Posicao invalida!");
		}

	}
	
	private static void imprimirTamanhoVetor(Lista<Contato> lista) {
		System.out.println("Tamanho do vetor e de: " + lista.tamanho());
	}
	
	private static void limparVetor(Lista<Contato> lista) {
		lista.limpar();
		System.out.println("Todos os contatos do vetor foram excluido!");
	}
	
	private static void imprimirVetor(Lista<Contato> lista) {
		System.out.println(lista);
	}
	

	private static void obtemContato(Scanner scan, Lista<Contato> lista){

		int pos = lerInformacaoInt("Entre com a posicao a ser pesquisada", scan);

		try {

			Contato contato = lista.busca(pos);

			System.out.println("Contato existe, segue os dados do contato");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encotrado: ");
			pos = lista.busca(contato);
			System.out.println("Contato encontrado na posicao" + pos);

		} catch (Exception e) {
			System.out.println("Posicao invalida!");
		}

	}

	private static int lerInformacaoInt(String mensagem, Scanner scan) {

		boolean entradaValida = false;
		int num =0;
		while (!entradaValida) {

			try {
				System.out.println(mensagem);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;

			}catch (Exception e) {
				System.out.println("Entrada invalida, digite novamente");
			}



		}
		return num;
	}

	private static String lerInformacao(String mensagem, Scanner scan) {
		System.out.println(mensagem);
		String entrada = scan.nextLine();

		return entrada;
	}

	private static int ObterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;


		while (!entradaValida) {

			System.out.println("Digite a opcao desejada:");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posicao especifica");
			System.out.println("3: Busca contato de uma posicao especifica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta ultimo indice do contato");
			System.out.println("6: Verifica se o contato existe");
			System.out.println("7: Remove por posicao");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: Imprimir vetor");
			System.out.println("0: Sair");

			try {
				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if(opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}

			}catch (Exception e) {
				System.out.println("Entrada invalida, digite novamente \n\n");
			}


		}


		return opcao;
	}


	private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {

		Contato contato;

		for(int i=1; i<=quantidade; i++) {

			contato = new Contato();
			contato.setNome("Contato 1" + i); 
			contato.setTelefone("111111" + i);
			contato.setEmail("contato1@gmail.com" + i);

			lista.adiciona(contato);
		}
	}
}
