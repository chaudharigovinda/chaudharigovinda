package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exce3afterjava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exce3afterjava7 obj=new exce3afterjava7();
		
try {
			
			FileReader objFileReader=new FileReader("");
		}catch(FileNotFoundException m){
			m.printStackTrace();
			
		}catch(IOException n) {
		n.printStackTrace();
		}finally {
			obj=null;
			System.out.println("");
		}
		
		// after java 7 we can write 
		try (FileReader objFileReader =new FileReader("");  
				// here if error occure ther put ioexception in catch
				FileReader objFileReader1 =new FileReader("");){ 
			//after java 7 we can write exception code inside try also
			
			//FileReader objFileReader =new FileReader("");
			System.out.println(" inside try");
		}
		
		catch(IOException|NullPointerException  | ArithmeticException m ) {
			// here reference m is for last exception
			// | is pipe symboll
			m.printStackTrace();
		}
		finally {
			//after java7 we no need to null object
		}
	}

}
