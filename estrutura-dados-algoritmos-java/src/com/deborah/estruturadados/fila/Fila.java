package com.deborah.estruturadados.fila;

import com.deborah.estruturadados.base.EstruturaEstatica;

public class Fila<T>  extends EstruturaEstatica<T>{
	
	public Fila() {
		super();
	}

	public Fila(int capacidade, Class<T> tipoClasse) {
		super(capacidade, tipoClasse);
		
	}

	public Fila(int capacidade) {
		super(capacidade);
		
	}
	
	public void enfilerar(T elemento) {
//		this.elementos[this.tamanho] = elemento;
//		this.tamanho++;
		
		this.adiciona(elemento);
	}
	
	public T espiar() {
		return this.elementos[0];
	}
	
	public T desenfilerar() {
		
		final int POS=0;
		
		if(this.estaVazia()) {
			return null;
		}
		
		T elementoASerRemovido = this.elementos[POS];
		
		this.remove(POS);
		
		return elementoASerRemovido;
	}
	
	

}
