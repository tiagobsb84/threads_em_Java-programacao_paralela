package com.rhreads.sincronizando;

public class TarefaNumero2 implements Runnable {

	private Banheiro banheiro;
	
	public TarefaNumero2(Banheiro banheiro) {
		this.banheiro = banheiro;
	}
	
	@Override
	public void run() {
		this.banheiro.fazendoNumero2();
	}
}
