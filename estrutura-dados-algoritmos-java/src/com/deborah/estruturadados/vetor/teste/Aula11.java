package com.deborah.estruturadados.vetor.teste;

import com.deborah.estruturadados.vetor.Lista;
import com.deborah.estruturadados.vetor.VetorObjetos;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista<String> vetor = new Lista<String>(1);
		
		vetor.adiciona("Elemento");
		
		System.out.println(vetor);
	}

}
