package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class excethrows {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
excethrows obj =new excethrows();
obj.m1();
obj.m2(); //this error can remov eby use throws in main method
	}
//this is first method for exception 
public void m1() {
try {
	FileReader test =new FileReader(new File("") );
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}

// this is second mwthod of exception
public void m2() throws FileNotFoundException { // it means it throw error to caller method 
	// here caller method of m1 is main method
	FileReader test =new FileReader(new File("")); // this line show erroe if we not use throws in above line
	
	
}
}