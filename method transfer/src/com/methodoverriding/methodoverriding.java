package com.methodoverriding;

import com.inheritant.inheritance3;
import com.inheritant.nonp;

class memo{
	public void m2() {
		
		
		System.out.println(" i am cat");
	}
	public hirect mem() { //this is non premitive data type return method
		 // non ppremitive data type are class ,array, string,
		//in this method we have use class non premitive data type hirect class in this package -
		
		// in this method we are going to do methodoverriding for non premitive datatype- 
	//so we have take hirect class
		//because it has child parent relation and we do overridind if we have only this relation
		// we do non premitive return method as like
	hirect obj=new hirect();
		
		return obj;
	}
	
	public int m4() {
		int var=10;    // this us premitive return method
		return var; //if local variable not used then we use return 1;
	}
	

	
}
public class methodoverriding extends memo {

	
	
	public void m1() {
		
		System.out.println(" i am dog ");
	}
public void m2() { // we can not reduce access modifier afer overriding -
	//but we can increase acess modifier -
	//such as we can do public if in parent class has private but we cannot do reverse of it
		
		
		System.out.println(" i am bull");
	}

// method overriding means to change properties of parent class method in child class 
//m2 is parent class method we change characteristics -
//of m2 in child class so we have call this method in child class

//in method overriding the method signature should be same -
//for method which we are override for premitive variable	
//method signature means method name and its parameter

	

public hirect  mem() {
	// in non premitive data type in method overriding we can use method signature same or -
	//we can use child class of non premitive datatype class taken as like below
	//[public three memo() {
	//	three obj=new three();
		
		//return obj;
	//}]
	hirect obj=new hirect();
	
	return obj;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
methodoverriding obj=new methodoverriding();

obj.m1();

obj.m2();
	}

}



