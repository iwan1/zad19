package zad19;

import javax.management.RuntimeErrorException;
import javax.swing.ImageIcon;
import java.io.File;

public class main {

	static void dzieleniePrzezZero(int a) throws Exception{
		if(a == 0){
			System.out.println("Tylko zero dzieli przez zero :O");
			throw new Exception("JESTES ZEREM!");
		}
	}



	static void gdzieTenPlik(String plik) throws RuntimeException{
		File a = new File(plik);
		
		if(!a.exists()){
			throw new RuntimeException("Nie ma tu takiego pliku!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 0;

		try {
			dzieleniePrzezZero(y);
			x = x/y;
		} catch (Exception e) {
			e.printStackTrace();
		}

		try{
			gdzieTenPlik("takiegoplikutuniema.ups");
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
