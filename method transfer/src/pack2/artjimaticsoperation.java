package pack2;

public class artjimaticsoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 artjimaticsoperation obj=new artjimaticsoperation();
 obj.add(2, 4);
 obj.sub(2, 4);
 obj.multi(4, 2);
 artjimaticsoperation.division(7, 2);//it shows quotient
 artjimaticsoperation.modulue(7,2);// it shows reminder ,% it is modulue sign

 
 
	}
	public void add(int a, int b) {
		System.out.println("this is  + operator test" + (a+b));
	}
	public void sub(int a, int b) {
		System.out.println("this is  - operator test" + (a-b));
		
	}
	public void multi(int a,int b) {
		System.out.println("this is  * operator test" + (a*b));
		
	}
	
	public static void division(int a,int b) {
		
		System.out.println((a/b));
		
	
	}
	
	
	public static void modulue(int a,int b) {
		
		System.out.println("this is operator test " + (a%b));
	}
	}

	