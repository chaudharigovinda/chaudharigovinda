package pack2;

public class unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  unary obj=new unary();
obj.plus(5); // plus is method name
obj.minus(5);
obj.addp(5);
obj.minum(5);

int var1=5;
System.out.println(++var1);// first add then print
System.out.println(var1++);// first print and then add
System.out.println(var1);
System.out.println(++var1 + var1++); // var1=7+1=8,

	}
	
	public void plus(int a) {
		System.out.println("this is operator a"  +  (+a));
		
	}
	public void minus(int b) {
		System.out.println("this is operator a"  +  (-b));
		
	}
	
	public void addp(int a) {
		System.out.println("this is operator a" + (++a));
	}
	public void minum(int b) {
		System.out.println("this is operator a" + (--b));
	}
	}
	


