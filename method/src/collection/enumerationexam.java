package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class enumerationexam {
// enumeration is coolection type use for call object one after one for vector class
	// enumeration is interface
	//enumeration implements vector
	// enumeration does not have remove method
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
Vector<String> obj=new Vector<String>();
obj.add("first");
obj.add(1, "second");
obj.addElement("vector");


Enumeration<String> enumerationobj =obj.elements();
while(enumerationobj.hasMoreElements()) {
	
	System.out.println(enumerationobj.nextElement());}
	
	System.out.println(obj);
	
	//we can use iterator for call object alos but it has remove method also
	
	Iterator<String> iterat=obj.iterator();
	while(iterat.hasNext()) {
		
		
		System.out.println(iterat.next());
		
	iterat.remove();
	}
	System.out.println(obj);
	
	
}




	}


