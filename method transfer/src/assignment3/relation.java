package assignment3;

public class relation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     relation obj=new relation();
     
     //swap two number 
     //means interchange the value
     int c=12;
     int d=14;
     System.out.println(" before swap");
     System.out.println("first no =" + c);
     System.out.println("second no =" + d);
     
     int temporary=c;
     c=d;
     d=temporary;
     System.out.println("after swap");
     System.out.println("first no =" + c);
     System.out.println("second no =" + d);
     
     //end swap
     obj.m1(4, 3);
     
     obj.m2(5f, 6f);
     
     //print grater valu
     int a=7;
     int b=6;
     
     if (a>b) {
    	 System.out.println("print the greater valu" + a);
     }else 
     { System.out.println("print the greater valu" + b);
     }
     }
     
	
	
	public void m1(int a,int b) {
		
		System.out.println(" print greater valu"  +  (a>b));
	}
	// multification of float
	public void m2(float a,float b) {
		
		System.out.println(a*b);
	}
	
	
	}
	
	
	


