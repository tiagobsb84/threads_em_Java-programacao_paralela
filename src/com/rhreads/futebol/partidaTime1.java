package com.rhreads.futebol;

public class partidaTime1 implements Runnable {

	private Partida partida;
	
	public partidaTime1(Partida partida) {
		this.partida = partida;
	}
	
	@Override
	public void run() {
		this.partida.time1();
	}

}
