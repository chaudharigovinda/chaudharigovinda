package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Map is not patr of collection 
//map use key - value paire
		//is use HashMap
		//Map doesnt extends collection interface
		HashMap< Integer,String> obj=new HashMap<Integer,String>();
		obj.put(1, "one");// it use put for adding// 1 is key and "one" is value
		obj.put(2, "two");
		obj.put(3, "two");// we cannot duplicate key but value can be duplicate but it will overwrite-
		                  //- means 3=two
		                  // map is based on key not on value
		System.out.println(obj);
		HashMap<Integer, String> obj1=new HashMap<Integer, String>();
		obj1.putAll(obj); //putall similar to addall
		System.out.println(obj1);
		HashMap<String, Float> nam=new HashMap<String, Float>();
		nam.put("four", 4.0f);
		nam.put("five", 5.0f);
		nam.put("FIVE", 5.0f); // it will print if key name is same but it is in uppercase-
		                       //-because java is case sensitive
		System.out.println(nam);
		System.out.println(nam.remove("four"));// it will remove based on key
		System.out.println(nam);
		System.out.println(nam.remove("five", 5.0f)); //after that it will print only FIVE=5.0f -
				                                   //- because we have remove four=4.0 before it
		System.out.println(nam);
		
		//key is called as entery --- entry is sub interface of map
		//use of keyset method which retuen set-- it is use in HashMAP
		// it will print only FIVE=5.0f because we have remove four=4.0 before it
			System.out.println(nam.keySet()); //here we  called based on key
			System.out.println(nam.values());	//here we caleed base on value
			//iterate through iterator
			Iterator t=nam.keySet().iterator();
			while(t.hasNext()) {
				System.out.println(t.next());
				// use of entryset which is return set entry
				Set<Entry<String, Float>> entry=nam .entrySet();
				
			// iterator through all kevalue paire
			// here we use for each loop
			for(Map.Entry<String, Float> t1:entry)	{
				System.out.println(t1.getKey()+""+t1.getValue());
				
			}
		
		//Hashset is different from HashMap as below
		HashSet<Integer> obj2=new HashSet<Integer>();
		obj2.add(1);
		obj2.add(2);
		System.out.println(obj2);
		
	}

}
}

