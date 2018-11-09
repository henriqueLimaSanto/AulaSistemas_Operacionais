package controller;

import java.io.IOException;

public interface IArquivosController {
     
	public void leDir(String dir)throws IOException;
	 public void escreverArq(String dir, String arg) throws IOException;
	 public void abreApp(String dir, String arq)throws IOException;
	 
}
