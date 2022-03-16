package pack3;

public class thisword {
	int a;
	int b;
	static int c; // that variable is static  and abve are instant variable
	public void m1() {
		
		System.out.println(this);
		a=5; //this is use as object it reperesent this=obj
	}
	
	public void m2(int a,int b,int c) { // parameters are local variable
		// use of that word for find out instance variable
		System.out.println(this);
		// here this reperesent for abc object
		this. a=a;  //here =a,b,c are local variable in m2 method
		this. b=b;// that and above variable are differentiate by this word beacuse this reperesent as object 
		          
		thisword. c=c;// c ic static variable so it can find out by classname
		m3(this); //to call static method this use as parameter/argument
		          //this =obj
	}
	public static void m3( thisword abc) {// abc=obj
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisword obj=new thisword();
		System.out.println(obj);
		thisword abc=new thisword();
		System.out.println(abc);
		obj.m1();
		abc.m2(5, 5, 4);
		
		// line no20 and23 have same reference id when we run because 
		//we have use this word in m1() println(System.out.println(this);)
		 //and we have use direct object only in object printlin(System.out.println(obj);)
		// this have also applicable foe line no 22 and 24
		

	}

}
