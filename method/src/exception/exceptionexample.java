package exception;

public class exceptionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
exceptionexample obj=new exceptionexample();

obj.m1();

	}

	public void m1() {
		
		m2();
		
	}
	
	
	public void m2() {
		
		try {
			
			System.out.println(10/0);
		}
		catch(NullPointerException m) { //here try has arithmatic relation but-
			//we have use nullpointexception in catch so it will give error while run
			System.out.println(" exception");
		}
		finally { exceptionexample obj=null;
	// finally block is use to release object memory wether there is exception
		// finally block always come with try and catch block
			//finally block is use to run program even there is exception
			System.out.println("execute if exception");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
