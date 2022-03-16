package pack2;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 nestedif obj=new nestedif();
 
 
	int var=10;
	int var1=20;
	obj.m2(10);
	// when first condition true then it will go to next condition otherwise it cannot run .
	//at that above condition else also will not run
	// if second condition false then run will be for else condition
	
	if (var>9) {
		
		if (var1>16) {
			
			System.out.println("you are able to go");
		}
		else {
			System.out.println(" you are out");
		}
	}
		
	}
  

  
public void m2(int a) {
	
	if (a>11) {
		
		System.out.println(" ia m");
	}else {
		System.out.println(" ii not");
	}
	
}
}

