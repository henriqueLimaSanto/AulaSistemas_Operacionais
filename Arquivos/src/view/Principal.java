package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          IArquivosController ac = new ArquivosController();
           /*
           String dir = "C:\\Windows";
           
           try {
			ac.leDir(dir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
          
		String dir = "C:\\TEMP";
		String arq = "newFile.txt";
		
		/*try {
			ac.escreverArq(dir, arq);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*try {
			ac.leArq(dir, arq);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		try {
			ac.abreApp(dir, arq);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
