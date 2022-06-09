package com.rhreads.futebol;

public class PrincipalPartida {

	public static void main(String[] args) {
		Partida partida = new Partida();
		
		Thread time1 = new Thread(new partidaTime1(partida), "Brasil");
		Thread time2 = new Thread(new partidaTime2(partida), "Argentina");
		time1.start();
		time2.start();
	}

}
