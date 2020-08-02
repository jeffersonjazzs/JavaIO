package com.br.itimagine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Exibir um arquivo de texto
 */

public class ShowFile {
	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;

		if (args.length != 1) {
			System.out.println("TEST");
			return;
		}

		try {
			fin = new FileInputStream(args[0]);

			do {
				i = fin.read();
				if (i != 1)
					System.out.println((char) i);
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro de I/O");
		} finally {
			// fechar arquivo em todos os casos.
		 try{
			 if(fin != null) fin.close();
			} catch (IOException e) {
				System.out.println("Erro ao fechar arquivo");
			}
		 }
	}
}