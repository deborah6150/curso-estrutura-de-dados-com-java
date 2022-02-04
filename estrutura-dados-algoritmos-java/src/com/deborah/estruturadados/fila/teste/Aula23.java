package com.deborah.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<>();
		
		fila.add(1);//enfilerar
		fila.add(2);
		
		System.out.println(fila);
		
		System.out.println(fila.peek());//espiar
		
		System.out.println(fila.remove());//desenfilerar
		
		System.out.println(fila);

	}

}
