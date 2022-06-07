package com.rhreads.nomes;

public class OrdemDeExcucao {
	public static void main(String[] args) {
		
		String nomeProcurado = "da";
		
		Thread threadAutores = new Thread(new TarefaBuscador("autores.txt", nomeProcurado));
		Thread threadAssinaturas1 = new Thread(new TarefaBuscador("assinaturas1.txt", nomeProcurado));
	    Thread threadAssinaturas2 = new Thread(new TarefaBuscador("assinaturas2.txt", nomeProcurado));

		threadAutores.start();
		threadAssinaturas1.start();
		threadAssinaturas2.start();
	}
}
