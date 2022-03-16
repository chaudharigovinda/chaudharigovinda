package pack3;

public class constuctorthis {
	
	
	
	public  constuctorthis() { // Constructor with no parameter
		this(5,6);// this is use to call another constructor in
		               //this constructor with this consructoe object within in same clss only
		              
		              // (5,6) are the parameter of second constuctor (int a,int b)
		              // we can put (int ab) valu also
		               // this word should be on second line after syntax of constructor
		System.out.println(" i am no parameter");
	
	}
public  constuctorthis(int a,int b) { // Constructor with parameter
		
		System.out.println(" i am with parameter");
	}
public  constuctorthis(int ab) { // Constructor with  parameter
	
	System.out.println(" i am with  one parameter");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 constuctorthis obj=new constuctorthis(); //this object of first constructor only 
                                           //and we can call any other constuctor with using "this" word 

 obj=new  constuctorthis(5,5);     // we can call two parameter constructor with like this also                               
		
		}
	}


