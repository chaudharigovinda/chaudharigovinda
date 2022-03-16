package com.inheritant;

public class animal {
	
	int a;// instance variable
	
	animal(){
		
		a=12;
		
		// initialising the instsnce variable
		System.out.println("i am constructor");
	}
	
	
	
public void eat() {
		
		System.out.println("i am eating");
	}
animal(int b){

	System.out.println("jhjh");
}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

animal obj1=new animal();

obj1.eat();

	}

}
