package exception;

public class exception {

	
	//exception means there is mistake in programm
	
	//main class of exception is throwable class
	//throwable class has two sub class =1 exception 2 error
	//execption is due to programmer error
	//error is due to system error
	//exception has two typr= 1 check 2 uncheck
	//check is exeption given by complier automatically such as red line below mistake
	//uncheck is execption get when we run the program it get on console means it is runtime exception
	
	//we use try and catch methods to remove exception
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
exception obj= new exception();
obj.m1();
//obj.m2();
System.out.println(" main method");
	}

	public void m1() {
	
		m2();
		System.out.println("m1 method");
	}
	
	public void m2() {
		
		 // in exception runtime will print sentence before exception occure
		System.out.println(" print before exception");
		//System.out.println(10/0); it will givee exception
		// so put it in try and catch to sole exception
	//try and catch will be in method which has exception
	
	try{ 
		System.out.println("after exception");//if it is before exception statment then it will not print
		System.out.println(10/0);
		
	}
	catch(ArithmeticException m){ //ArithmeticException it is taken by java  by us
		m.printStackTrace();// this print exception name,exception discriptoin,exception navigation step
		System.out.println(m.toString());// it will print  name and description 
		System.out.println(m.getMessage()); // it will print description
		System.out.println("solved exception");
	}
	
	}
}

	
	
	
	
	
	


