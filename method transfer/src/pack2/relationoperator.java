package pack2;


import pack1.mc1;

public class relationoperator extends mc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		relationoperator obj=new relationoperator();
		obj.greaterthan(2, 4);
		obj.lessthan(2, 4);
		obj.equalto(2, 2);
		int c=obj.ad(2, 4);
		System.out.println(c);
		
		mc1 obj1=new mc1();
		obj1.m1();
		obj.m2(c, c);
	}

	public void greaterthan(int a,int b) {
		
		System.out.println("is greater than b ?"  + ( a>b));
		
	}
	public void lessthan(int a,int b) {
		System.out.println("is less   than b"  +  (a<b));
	}
	public void equalto(int a,int b) {
		
		System.out.println("is equal to b"  +  (a=b));
	}
	
	public int ad(int a, int b) {
		
		return a+b;
		
	}
	}
	

