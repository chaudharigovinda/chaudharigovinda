package com.methodoverriding;


class parent1{
	
	public static void m1() {
		
		System.out.println(" i am from static parent");
	}
	
	//public void m2() {
		
		
		//System.out.println(" i am from parent instance");
	//}
	
	
}

public class staticmeoverriding extends parent1 {
	
public static void m1() {
		
		System.out.println(" i am from static parent");
	}
	
//	public void m2() {
		
		
		//System.out.println(" i am from parent child instance");
	//}
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 	staticmeoverriding obj1=new staticmeoverriding(); //in every object first name 
		                                                   //of class is  object reference to that class 
		obj1.m1();                                            //and after new woerd the name of 
		                                               //  class means object pointed to that object class 
 parent1 obj=new parent1();
// obj.m2();
 obj.m1();
    parent1 obj2=new staticmeoverriding();
// obj2.m2();
 obj2.m1();
 
 // in static method the method overring is know as method hiding -
 //because static method cannot be override so this called as method hiding-
 

	}

}
