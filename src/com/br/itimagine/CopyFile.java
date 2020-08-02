package com.br.itimagine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  copiar um arquivo de texto
 *  executar: java CopyFile 1.txt 2.txt
 */
public class CopyFile {

	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;

		if (args.length != 2) {
			System.out.println("USO");
			return;
		}

		try {
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[0]);

			do {
				i = fin.read();
				if (i != -1)
					fout.write(i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("ERRO de IO" + e);
		}

	}
}