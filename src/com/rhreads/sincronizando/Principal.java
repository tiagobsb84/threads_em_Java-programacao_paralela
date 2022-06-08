package com.rhreads.sincronizando;

public class Principal {

	public static void main(String[] args) {
		Banheiro banheiro = new Banheiro();
		
		Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "Fulano");
		Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Beltrano");
		convidado1.start();
		convidado2.start();
	}
}
