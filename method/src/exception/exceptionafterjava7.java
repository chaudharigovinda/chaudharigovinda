package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exceptionafterjava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileReader objFileReader=new FileReader("");
		}catch(FileNotFoundException m){
			m.printStackTrace();
			
		}catch(IOException n) {
			n.printStackTrace();
		}
		
		// after java 7 we can write 
		try {
			
			FileReader objFileReader =new FileReader("");
		}
		
		catch(FileNotFoundException  | ArithmeticException m ) { // here reference m is for last exception
			// | is pipe symboll
			m.printStackTrace();
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
