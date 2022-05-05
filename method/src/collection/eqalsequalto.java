package collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class eqalsequalto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//every new word creat object
		Integer m1=new Integer(2);
		Integer m2=new Integer(2);
		//use of equal equals(==)
		// it compare using reference (object)
		System.out.println(m1==m2); //it will be false because every new word creat object
		// use of equalto
		System.out.println(m1.equals(m2)); //it will be true because it is content  comparision
		
		HashMap<Integer, Integer> obj=new HashMap<Integer, Integer>();
		obj.put(m1, 12);
		// it will ckeck key will present already or not
		System.out.println(obj);
//System.out.println(m1.equals(m2));
		//hashmap use equals method to check uniqueness
		obj.put(m2, 13); //here we change m2 value so hashmap has changed this value be replacing first  value
		System.out.println(obj);
		//IdentityHashMap is hashmap which use to find out identity
		IdentityHashMap<Integer, Integer> obj1=new IdentityHashMap<Integer, Integer>();
		obj1.put(m1, 12);
		obj1.put(m2, 13);
		System.out.println(obj1);
		
	}

}
