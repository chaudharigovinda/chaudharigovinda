package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class exce2afterjava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
	 FileReader objFileReader =new FileReader("");
 }
 catch(FileNotFoundException|ArithmeticException|Exception m) {
	 // error showe beacuse exception word haandle all exception so we not need to write other exception
 }
 
 
 
	}

}
