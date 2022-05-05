package collection;

import java.util.ArrayList;

public class collectionintefacemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Object> obj=new ArrayList<Object>();
//below is add method
//we have string and integer
obj.add("string");// index(0)
obj.add(2);// index(1)

System.out.println(obj);

ArrayList< Object> obj1=new ArrayList<Object>();
obj1.add(3); //index (2)
//below we have add obj1 into obj
obj.addAll(obj1);
System.out.println(obj);
obj.remove(2); //here we remove index 2
System.out.println(obj);
obj.removeAll(obj1);// here we removr all obj1 from obj
System.out.println(obj);
obj.clear();// here we clear obj
System.out.println(obj);
//above we have clea obj so we need to create another obj or other object
obj.add(2);
obj.add(15);

System.out.println(obj);

System.out.println(obj.contains(2));// it show contan 

Object p=obj.get(0);// this is homogenious statment 
System.out.println(p);// this is hetrogenious statment so it requierd casting of object as below
Integer f =( Integer) obj.get(0);
obj.set(0, 13); // set is  use to set value of object below value of previous value
System.out.println(obj);

	}

}
