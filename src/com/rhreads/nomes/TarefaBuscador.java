package com.rhreads.nomes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscador implements Runnable {
	
	private String arquivo;
	private String nomeProcurado;

	public TarefaBuscador(String arquivo, String nomeProcurado) {
		this.arquivo = arquivo;
		this.nomeProcurado = nomeProcurado;
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(arquivo));
			
			int numeroLinha = 1;
			
			while(scanner.hasNextLine()) {
				
				String linha = scanner.nextLine();
				
				if(linha.toLowerCase().contains(nomeProcurado.toLowerCase())) {
					System.out.println(arquivo + " - " + numeroLinha + " - " + linha);
				}
				
				numeroLinha++;
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
