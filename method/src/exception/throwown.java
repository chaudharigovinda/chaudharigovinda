package exception;

import string.string1;

public class throwown {
//throws is automatically get but "throw" we hvae to put
	public static void main(String[] args) {
		// TODO Auto-generated method stub
throwown obj=new throwown();
obj.Auth("", "ghg"); // it is usrname and password
	}


public void Auth(String password,String usermane ) {
	try {
		if (password.isEmpty()) { //string can be empty so result will be true or false
			//but funtinality should not be empty so it willshow nullpointexception error
		
		
		throw new NullPointerException();
	}
	}
	catch(NullPointerException m) {
		System.out.println("show error");
	}
	
}
}