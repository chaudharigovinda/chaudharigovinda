package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratoruse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("first");//ndex0
		obj.add("SECOND");//1
		obj.add("third");//2
		obj.add("fourth");//3
		System.out.println(obj); // it will print all object of obj
		//if we want to print one object we have to seperate it
		String p=obj.get(1);// 1 is index value
		System.out.println(p);
		//if we want lowe case operation on p
		System.out.println(p.toLowerCase());
		//if we have to do operation of whole collection we use iterator
		Iterator iterator=obj.iterator();
		while(iterator.hasNext()) { // hsenext is method of iterator
			System.out.println(iterator.next());
		}
		
		//abve is old method we can writ in for loop
		for(int i=0; i<obj.size();++i) {
     System.out.println(obj.get(i)); // here get is as per index
		}
	
		// for size =System.out.println(obj.size());
		
	}

}
