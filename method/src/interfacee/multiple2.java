package interfacee;

public interface multiple2 {
void m1(); // abstact method
	
	default void m2() {  // default method which is same in method signatur in inheritance multiple2 also
		
		System.out.println(" default 2");
		
	}
	
	static void m3() { // static method
		System.out.println(" static");
	}
}
