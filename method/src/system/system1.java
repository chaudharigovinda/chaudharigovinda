package system;


import java.util.Properties;

import typecasting.casting;


public class system1 {
	
	public static casting out1;// non premetiv data type because class represent it

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		system1 obj1=new system1();//system1 obj1 = object declaration
				                  // =new system1()=  object initialization
		System.out.println(system1.out1);
system1 .out1=new casting();
System.out.println(system1.out1);
//System.exit(1); // it is use to nothing will run after it
Properties prop= System.getProperties();
System.out.println(System.getProperty("user.language"));
prop.list(System.out); // it is use to find out properties of java





	}

}
