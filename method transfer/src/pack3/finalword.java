package pack3;

public class finalword {
	
	public final float pi; //that is an instance variable it can initiate in constructor or 
	                       //  as in this place also as like "public final float pi =3.14f; 
	public static final int p; // this is static variable so to initiate it we requierd static block or we can initiate here directly
	
     public finalword() {
		 pi=3.14f;
	}
     
     static { //that is static block
System.out.println(" iam static block 1");
    	 p=12;
     }
     
     

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		finalword obj=new finalword();
  System.out.println(obj.pi);
  
	}
	static {
		System.out.println(" iam static block 2"); // a;ways static run first then other
		    	 
		     }

}
