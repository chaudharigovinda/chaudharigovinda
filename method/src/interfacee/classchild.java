package interfacee;

public  class classchild implements interface1 {
 //we creat inheritance of interface with class by implements word
	public static void main(String[] args) {
		// TODO Auto-generated method stub
classchild obj=new classchild();
obj.m1();
obj.m2();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("3");
	}

}
