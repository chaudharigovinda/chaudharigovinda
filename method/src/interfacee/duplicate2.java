package interfacee;

public class duplicate2 implements multipleinterface,multiple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
duplicate2 obj=new duplicate2();
obj.m2();
obj.m1();
multipleinterface.m3(); //in inheritance static mmethod called by inheritance name not class name

	}

	@Override
	public void m1() { // duplicate method approch here
		// TODO Auto-generated method stub
		System.out.println(" abstract");
	}

	
	public void m2() {// when we execute the default method in object then java show error 
		            // below the class name and ask for tho which interface method we have to call when there are two smae method 
		          // in both inhetitance interface
		// TODO Auto-generated method stub
		multiple2.super.m2();//or we can imlement here also by deleting the line no21 sentence
	}

}

