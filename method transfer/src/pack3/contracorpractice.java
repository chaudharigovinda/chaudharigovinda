package pack3;

public class contracorpractice {
	//contractor is like method but we cannot use return type in sintax
	//constructor name isame as class name
	int a;
	int b;
	int c;
	int g;
	public contracorpractice () {  //Contractor with no parameter
		// this word is use as object if object is not created
		
		this.a=5;
		this.b=12;
		this.c=13;
		
	}
	public contracorpractice (int a) {//Contractor with parameter
	g=a;
		System.out.println("false");
		
		b=a;
	
		// we assign value of int a to c
		 // int a value is given in object paramert
		  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// contractor is use to call default value
		contracorpractice obj=new contracorpractice(); //new word create object
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		 contracorpractice obj1=new contracorpractice(10);  //object of Contractor with parameter
		 System.out.println(obj1.a);
			System.out.println(obj1.b); 
			System.out.println(obj1.c);
			System.out.println(obj.g);
	}

	
}
	
	

