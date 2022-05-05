package collection;

import java.util.Hashtable;

public class hashtableem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<String, String> obj=new Hashtable<String, String>();
obj.put("one", null);
System.out.println(obj); // it will give  nullpointexception error
//because hashtable does not allow null valu
//but hashmap allow null valu
	}

}
