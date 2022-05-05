package collection;

import java.util.Stack;
import java.util.Vector;

public class vectorcoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<String> obj=new Vector<String>();
//we  use element in method of vector
obj.addElement("vector");
System.out.println(obj);

//stack is also list type
Stack<String> obj1=new Stack<String>();
//in stack we use push for add
//in stack first come last go and it is reverse also means last come first out
obj1.push("stack1");
obj1.push("stack2");
System.out.println(obj1);
obj1.pop(); //pop is use for delete in vector
System.out.println(obj1);
	}

}
