package com.rhreads.futebol;

public class partidaTime2 implements Runnable {

	private Partida partida;
	
	public partidaTime2(Partida partida) {
		this.partida = partida;
	}
	
	@Override
	public void run() {
		this.partida.time2();
	}
}
