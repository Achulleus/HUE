package exeption;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SomeExceptions {

	public static void main(String[] args) {
		
		try {
			String s = "Madersbacher";
	        int i = Integer.parseInt(s);
	        System.out.println(i); 
		}
		catch(NumberFormatException a){
			System.out.println("");
			a.printStackTrace();
		}
		try {
			FileReader Noah = new FileReader("C:\\Dokumente\\Test.txt");
			System.out.println(Noah);
		}
		catch(FileNotFoundException b){
			System.out.println("");
			b.printStackTrace();
		}
		try {
			int [] x = new int[5];
			for(int i = 0; i < x.length; i++) x[i] = i;
			for(int i = 0; i <= x.length; i++) System.out.println(x[i]);
		}
		catch(ArrayIndexOutOfBoundsException c) {
			System.out.println("");
			c.printStackTrace();
		}
		finally{
			System.out.println("Jetzt werde ich nicht mehr ausgeführt.");
		}
		System.out.println("Nach dem finally.");
	}
}
