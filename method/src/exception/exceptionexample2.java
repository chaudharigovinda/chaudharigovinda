package exception;

public class exceptionexample2 {
	int  []a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
exceptionexample2 obj=new exceptionexample2();
obj.m1();
System.out.println("main method");

	}

public void m1() {
	
	m2();
	System.out.println("m1 method");
	
}
public void m2() {
	System.out.println("m2 metod");
	
	try {System.out.println(a.length);// it will show nullpoint exception because we didnt initiate array
		// abve is exception  then below of it will not run 
		System.out.println(10/0);
	}
	
	//try has multiple catch
	//if we use muliple catch but use one currect cath then it will run only currect catch statment
	catch(NullPointerException m) { //here try has arithmatic relation but-
		//we have use nullpointexception in catch so it will give error while run
		System.out.println(" null point exception");
	}
	catch(ArithmeticException m) {
		
		System.out.println("arithnatic exception");
	}
	
	catch(ArrayIndexOutOfBoundsException m) {
		 System.out.println("another catch");
	}
	finally {
 
		System.out.println("finally");
	}
	
	
}
}
