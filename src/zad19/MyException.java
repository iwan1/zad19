package zad19;

import java.io.File;

public class MyException {
	public static void p() throws FindFileException{
		File a = new File("takiegoplikututuniema.cwks");
		if(!a.exists()){
			System.out.println("Wyjatek z p()");
			throw new FindFileException("Nie znaleziono pliku!");
		}
	}
}
