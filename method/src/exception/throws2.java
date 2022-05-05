package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//it is multiple method throws
//throws give eror in caller method
public class throws2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		throws2 obj=new throws2();
		obj.m1();

	}

public void m1() throws FileNotFoundException {
	m2();
}
public void m2() throws FileNotFoundException {
	m3();
}
public void m3() throws FileNotFoundException {
	m4();
}
public void m4() throws FileNotFoundException {
	FileReader tet =new FileReader(new File(""));
	
}
}