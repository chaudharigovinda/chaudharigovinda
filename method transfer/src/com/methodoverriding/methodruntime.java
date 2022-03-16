package com.methodoverriding;


class paremtrun{
	
	
	public void m1(int a,int b  ) {
		
		System.out.println((a+b));
	}
}

public class methodruntime extends paremtrun{
	
public void m1(int a,int b  ) {
		
		System.out.println("child"+(a+b));
	}

public void m1(int a,int b, int c) {
		
		System.out.println("i am fro child"+(a+b+c));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  methodruntime obj=new methodruntime();
  
obj.m1(2, 10); // complier call two parameter method 
            //so complier know which method it has to call it is called as compiler runtime
  obj.m1(0, 0, 0);
  paremtrun obj1=new paremtrun();
  
  obj1.m1(10, 1);
  
  paremtrun obj2=new methodruntime();
  obj2.m1(10, 50);
 //complier run time call refernce class method-
 //but run only the class which is pointed to object class-
 // means refernce class is paremtrun but object pointed to methodruntime
	}

}
