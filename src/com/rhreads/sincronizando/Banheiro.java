package com.rhreads.sincronizando;

public class Banheiro {

	public void fazendoNumero1() {

		String nome = Thread.currentThread().getName();

		synchronized (this) {
			System.out.println(nome + ", Batendo na porta do banheiro");
			System.out.println(nome + ", Entrando no banheiro");
			System.out.println(nome + ", Fazendo coisa rápida");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(nome + ", dando descarga");
			System.out.println(nome + ", lavando a mao");
			System.out.println(nome + ", saindo do banheiro");
		}
	}

	public void fazendoNumero2() {

		String nome = Thread.currentThread().getName();

		synchronized (this) {
			System.out.println(nome + ", Batendo na porta do banheiro");
			System.out.println(nome + ", Entrando no banheiro");
			System.out.println(nome + ", Fazendo coisa demorada");
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(nome + ", dando descarga");
			System.out.println(nome + ", lavando a mao");
			System.out.println(nome + ", saindo do banheiro");
		}
	}
}
