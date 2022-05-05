package exception;

public class exception3 {
int a[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
exception3 obj=new exception3();
obj.m1();
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
		
		catch(Exception  m) { //here we use exception so it is common to all error
			// so we no need no give other exception in catch 
			
			//we have use nullpointexception in catch so it will give error while run
			System.out.println(" null point exception");
		}
		//it we write as below for another exception then it will show error 
		//because ecxeption is handle by above catch exception
		
		//catch(ArithmeticException m) {
			
			//System.out.println("arithnatic exception");
		//}
		
		
		finally { //we can use only one finally block
			System.out.println("finally");
		}
		
	}
}
		

