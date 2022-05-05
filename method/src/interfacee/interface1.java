package interfacee;

public interface interface1 {
	//for interface go to new--> select interface
	//interface is 100%
	//abstract is 0-100%
	//those both mean is what is happen but not how it happen
	int a=2; // every variable in interface is' public static final' but no need to write it -
	//it taken by automaticalyy by java in interface
// in interface every variable shoul be initialize
	
	// acess modifier is always public in interface
	
	
	
	public abstract void m1();
	
	//every method in interface is 'abstract and non static/instance'
	
	// we cannot create static method in interface upto java8
	void m2();
	
	//we can write method as like also public abstract is taken by default
	// in interface we cannot creat object so -
	//to implement the abstract method we have to create inheritance if interface
	
	void m6();
	// see duplicatemethodinterface class 
	// it is for multiple interface 
	// we can create multiple interface
}
