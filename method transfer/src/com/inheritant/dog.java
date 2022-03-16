package com.inheritant;
// inheritance means to call properties of another class or methods also


public class dog extends animal { // dog is child class animal is parent class
             
	dog(){
		
		this(10); // this word is for call constuctor between same class// in that this(10) use for initiate to line no 16 constuctor
		//super();is use to call constuctor fromchild class parent  class to
		 // super also write in first line as like this word
		
		System.out.println(" i am dog");
	}
	
	dog(int a){
		
		super(4);// if there is no parameter in constuctor of parent class then super will come automatic by default
		
		//if there is  parameter in constuctor of parent class then super will not come automatic by default then we have to add it
		this.a=a; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 dog obj=new dog();// object requierd for run child 
                    //and parent class but object of dog class due to use of " extents" word 
        // first run parent class then child class will run
 
  System.out.println(obj.a);
	}

}
