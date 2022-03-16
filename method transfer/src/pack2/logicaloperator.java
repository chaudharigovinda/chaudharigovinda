package pack2;

public class logicaloperator{ 

	public static void main(String[] args) {
		int var=6;
		
		// && logical operator(and)
		System.out.println("first condition false so result " + (6<5 && 7>6));
		System.out.println("second condition false so result " + (6>5 && 4>6));
		System.out.println("both condition false so result " + (6<5 && 4>6));
		System.out.println("both condition trueso result " + (6<7 && 8>6));
		// || logical operator(or)
		System.out.println("first condition false so result " + (6<5 || 7>6));
		System.out.println("second condition false so result " + (6>5 || 4>6));
		System.out.println("both condition false so result " + (6<5 || 4>6));
		System.out.println("both condition trueso result " + (6<7 || 8>6));
		
	}

}
