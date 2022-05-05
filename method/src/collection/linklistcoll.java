package collection;

import java.util.LinkedList;

public class linklistcoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> obj=new LinkedList<String>();
//addfirst and addlast are linklist method
obj.addFirst("first");
obj.add("add");
obj.addFirst("last");
System.out.println(obj);
//but we add add first after add last then show below
obj.addFirst("afetr last");
System.out.println(obj);
	}

}
