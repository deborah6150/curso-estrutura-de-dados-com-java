package com.deborah.estruturadados.fila.teste;

import com.deborah.estruturadados.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {

		FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

		fila.enfilerar(1);
		fila.enfilerar(3);
		fila.enfilerar(2);

		System.out.println(fila);
	}

}
