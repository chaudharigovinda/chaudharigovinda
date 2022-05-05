package abstractacessor;
// Abstract is non access modifier
public abstract class abstractclass { // this is abstact class syntax
	
	//if there is abstract method in class then class shuold be abstact 
	public abstract void m1();//this is abstract method in which we cannot implement the method 
	//we only do declaration of method
	          // if we want to implement this abstact method then we have to -
	            // creat inheritance of this class and -
	            // -we can implement and exucate this method in child class
	
	public void m2() {  // this is instance method
		System.out.println("instance");
		
	}
	
	public static void m3() {  // this is static method
		
		System.out.println("static");
	}
	
	////private abstract void m4();// abstact method should have only public nd protected acess modifier
public abstractclass (){
	
	//we can creat constructor in abstract class
}

////public abstract static void m6(); //we cannot create static abstract static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //we cannot create object of absratact class  
		
//if we want to exucate te abstact method or method inside the abstact class 
		//then we have to create inheritance 
	}

}
