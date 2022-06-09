package com.rhreads.futebol;

public class Partida {

	public void time1() {
		String nomeSelecao = Thread.currentThread().getName();

		synchronized (this) {
			System.out.println("Seleção:" + nomeSelecao + ", Entrando no Vestuário!");
			System.out.println("Seleção:" + nomeSelecao + ", Vestindo a roupa da Seleção");
			System.out.println("Seleção:" + nomeSelecao + ", Aquecendo para entra em campo");
			System.out.println("Seleção:" + nomeSelecao + ", Entrando em campo");
		}
		esperaHino(3000);
	}

	public void time2() {
		String nomeSelecao = Thread.currentThread().getName();

		synchronized (this) {
			System.out.println("Seleção:" + nomeSelecao + ", Entrando no Vestuário");
			System.out.println("Seleção:" + nomeSelecao + ", Vestindo a roupa da Seleção");
			System.out.println("Seleção:" + nomeSelecao + ", Aquecendo para entra em campo");
			System.out.println("Seleção:" + nomeSelecao + ", Entrando em campo");
		}
		
		esperaHino(6000);
		System.out.println("As duas seleções estão preparadas para o inicio da partida!");
	}

	int millis;
	String nomeSelecao = Thread.currentThread().getName();

	public void esperaHino(int millis) {
		String nomeSelecao = Thread.currentThread().getName();

		try {
			Thread.sleep(millis);
			System.out.println("Seleção:" + nomeSelecao + ", Cantando o hino da seleção");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
