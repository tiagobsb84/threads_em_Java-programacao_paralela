package com.rhreads.futebol;

public class Partida {

	public void time1() {
		String nomeSelecao = Thread.currentThread().getName();

		synchronized (this) {
			System.out.println("Sele��o:" + nomeSelecao + ", Entrando no Vestu�rio!");
			System.out.println("Sele��o:" + nomeSelecao + ", Vestindo a roupa da Sele��o");
			System.out.println("Sele��o:" + nomeSelecao + ", Aquecendo para entra em campo");
			System.out.println("Sele��o:" + nomeSelecao + ", Entrando em campo");
		}
		esperaHino(3000);
	}

	public void time2() {
		String nomeSelecao = Thread.currentThread().getName();

		synchronized (this) {
			System.out.println("Sele��o:" + nomeSelecao + ", Entrando no Vestu�rio");
			System.out.println("Sele��o:" + nomeSelecao + ", Vestindo a roupa da Sele��o");
			System.out.println("Sele��o:" + nomeSelecao + ", Aquecendo para entra em campo");
			System.out.println("Sele��o:" + nomeSelecao + ", Entrando em campo");
		}
		
		esperaHino(6000);
		System.out.println("As duas sele��es est�o preparadas para o inicio da partida!");
	}

	int millis;
	String nomeSelecao = Thread.currentThread().getName();

	public void esperaHino(int millis) {
		String nomeSelecao = Thread.currentThread().getName();

		try {
			Thread.sleep(millis);
			System.out.println("Sele��o:" + nomeSelecao + ", Cantando o hino da sele��o");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
