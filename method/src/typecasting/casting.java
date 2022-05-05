package typecasting;

public class casting {
 //casting means to convert one datatype into another data type
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//it is implesite casting,it happen automaticall  
//in this casting we conert datatpye which are same and it happen automatically
//in this type source datatype is small than target
		int var1=50; //it is source
		
		
		int var2=var1; //it is target
		System.out.println(var2);
		
		
		//explesite casting below
		//in this the  source is more and target is small datatype
		//it requierd to write manually as write below
		
		int var3=286;
		byte var5=(byte) var3;
		System.out.println(var5);
		// here byte valu is 2^7=128  so it will be 286-128=30
		
		int j=300;
		byte k=(byte) j;
		System.out.println(k);
		// here byte valu is 2^8=256  so it will be 256-300=44 
		// here byte valu will change as per int datatype valu and byte vaalue will minus from int data type
	}

}
