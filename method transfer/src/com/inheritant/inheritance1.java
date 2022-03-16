package com.inheritant;


class father{
	
	int a;
	int b;
	
 public void m2() {
		 
		 
		 
	 
	
}
}
public  class inheritance1 extends father{
	
	int a;
	int b;
	
	 inheritance1(int b){
		this.b=b;  // this is use to identify the same local and instance variable between same class
		
		super.b=b; // super use to identify the same local and instance variable between parend and child class 
		super.m2();// super also use to call method from parent class in child 
		m1();
		
	
		// when we use super and this for only identification as above then there is no need to be first between them
	}
	 
	 
	 public static  void m1() {
		 System.out.println("jgfgh");
		 
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      inheritance1 obj=new inheritance1(5);
      
      
		
	}

}




	
	
	
	
	


