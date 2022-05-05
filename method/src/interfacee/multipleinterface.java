package interfacee;

public interface multipleinterface {
	
	void m1(); // abstact method which is same in method signatur in inheritance multiple2 also
	
	default void m2() { // default method which is same in method signatur in inheritance multiple2 also
		
		
		System.out.println(" default");
		
	}
	
	static void m3() { // static metho which is same in method signatur in inheritance multiple2 also
		System.out.println(" static");
	}

}
