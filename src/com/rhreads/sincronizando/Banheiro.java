package com.rhreads.sincronizando;

public class Banheiro {

	private boolean estaSujo = true;
	
	public void fazendoNumero1() {
		String nome = Thread.currentThread().getName();

		synchronized (this) {
			System.out.println(nome + ", Batendo na porta do banheiro");
			System.out.println(nome + ", Entrando no banheiro");
			
			if(estaSujo) {
				esperaLaFora(nome);
			}
			
			System.out.println(nome + ", Fazendo coisa rápida");
			
			dormirUmPouco(10000);
			
			this.estaSujo = true;
			
			System.out.println(nome + ", dando descarga");
			System.out.println(nome + ", lavando a mao");
			System.out.println(nome + ", saindo do banheiro");
		}
	}

	private void dormirUmPouco(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void fazendoNumero2() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + ", Batendo na porta do banheiro");

		synchronized (this) {
			System.out.println(nome + ", Entrando no banheiro");
			
			while(estaSujo) {
				esperaLaFora(nome);
			}
			
			System.out.println(nome + ", Fazendo coisa demorada");
			
			dormirUmPouco(5000);
			
			System.out.println(nome + ", dando descarga");
			System.out.println(nome + ", lavando a mao");
			System.out.println(nome + ", saindo do banheiro");
		}
	}

	public void limpa() {
		String nome = Thread.currentThread().getName();

	    System.out.println(nome + " batendo na porta");

	    synchronized (this) {

	        System.out.println(nome + " entrando no banheiro");

	        if (!this.estaSujo) {
	            System.out.println(nome + ", não está sujo, vou sair");
	            return;
	        }

	        System.out.println(nome + " limpando o banheiro");
	        this.estaSujo = false;

	        try {
	            Thread.sleep(10000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        this.notifyAll();

	        System.out.println(nome + " saindo do banheiro");
	    }
	}
	
	private void esperaLaFora(String nome) {

	    System.out.println(nome + ", eca, banheiro está sujo");
	    try {
	        this.wait();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
}
