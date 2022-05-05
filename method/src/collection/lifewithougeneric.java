package collection;

import java.util.ArrayList;

public class lifewithougeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj2=new ArrayList<String>();
		obj2.add(2); //this will show error because we have select string in arraylist 
		// if we want to remove error we have to use object in arraylist such as arraylist<Object>
		//because object is java class and use for hetrogenious statments
		
		obj2.add("string");
		

	}

	
}
