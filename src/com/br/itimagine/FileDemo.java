package com.br.itimagine;

import java.io.File;
import java.text.DateFormat;

/*
 * Leitura de arquivos com java
 */

public class FileDemo {
	static void p(String s) {
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		File f1 = new File("/java/arquivo.txt");
		p("nome do arquivo: "+ f1.getName());
		p("caminho do arquivo: "+ f1.getPath());
		p("caminho absoluto: "+ f1.getAbsolutePath());
		p("Nivel acima: "+ f1.getParent());
		p(f1.exists() ? "existe" : "não existe");
		p(f1.canWrite() ? "permite escritura" :  "nao permite");
		p(f1.canRead() ? "leitura" : "nao permite leitura");
		p(f1.isDirectory() ? "È" : "nao é " + "um diretorio");
		p(f1.isFile() ? "é um arquivo" : "não pode ser");
		p("Tamanho " + f1.length());
		p("ultima modificação " + f1.lastModified());
	
		long d =f1.lastModified();
	     
       DateFormat df = DateFormat.getDateTimeInstance();
       System.out.println("ultima modificação: " + df.format(d));


	}
}
