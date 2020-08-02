package com.br.itimagine;

import java.io.File;
import java.io.FilenameFilter;

/*Listar diretorio */

public class DirListOnly {

	public class OnlyExt implements FilenameFilter {
		String ext;

		public void Only(String ex) {
			this.ext = "." + ext;
		}

		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return name.endsWith(ext);
		}
	}

	public static void main(String[] args) {
		String dirname = "/java";
		File f1 = new File(dirname);
		FilenameFilter only = new OnlyExt("html");
		String s[] f1.list(only);
		
		for(int i=0; i< s.length; i++) {
			System.out.println(s[i]);
		}
	}

}