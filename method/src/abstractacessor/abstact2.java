package abstractacessor;

public abstract class abstact2 extends abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// class cl3 extends abstractclass{
	
//} this will show error if cannot class parent class abstract method
 //so that as below child class will be also abstact class
abstract class cl3 extends abstractclass{
	
}

class cl4 extends abstractclass{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	
}
//this meaning that we cannot create inheritance of abstract class if-
//we cannot call the parent abstract calss method which is abstract method-
//otherwise child class will be also abstact class-