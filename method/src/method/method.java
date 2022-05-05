package method;

public class method {
	
	public int var1;
	
	public void m1( int a,int b) {
		System.out.println(a+b);
		System.out.println("i am from m1");
	}
	public int m2(int a, int c ) {

 
 return a+c;
		
	}
	
	  
	
	public static void m3(int a,int b, int c) {
		System.out.println(a+b-c);
		System.out.println(" i am from m3");
	}
	
	
	public static int m4(int d,int g) {
		System.out.println(d+g);
		return 2;
		
		}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method obj=new method();
		System.out.println(obj.var1);
		System.out.println(" i am from m2");
		
		System.out.println(" i am from m4");
		obj.m1(3,5);
		obj.m1(0, 0);
		method.m3(6,4,5);
		obj.m2(0, 0);
		method.m4(5,60);
		int c=obj.m2(9, 5);
		System.out.println(c);
	}
}

	
	


