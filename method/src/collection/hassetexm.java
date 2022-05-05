package collection;

import java.util.HashSet;

public class hassetexm {
//hashset use to call objectbut not in sequence
//it is creat group of object but not allow duplicate object and isertion order not follow

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> obj=new HashSet<String>();
obj.add("first");
obj.add("second");
obj.add("third");
obj.add("first");// it is duplicate object so it wil overwrire oon exixting object
System.out.println(obj);

HashSet<String> obj1=( HashSet<String>) obj.clone();// clone is copy of one collection to another collection
//above there is two different data type collectos so we have done casting
//HashSet<String> obj1 it is string type object
//obj.clone(); it is clone type object
System.out.println(obj1);
obj.remove("second");
System.out.println(obj);
obj1.remove("first");
System.out.println(obj1);
	}

}
