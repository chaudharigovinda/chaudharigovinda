package assignment4;

public class constuctor {
	int a;
	
	public constuctor() {
		// TODO Auto-generated constructor stub
		this(4);
		System.out.println(" i am no con");
		this.a=4;
		
	}
	
	public constuctor(int a) {
		// TODO Auto-generated constructor stub
		System.out.println(" i am con");
		
		this.a=a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 constuctor obj=new constuctor();
 constuctor obj1=new constuctor(2);
System.out.println(obj.a);
	}

}
