package collection;

import java.util.TreeSet;

public class treesetem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//treeset will  follow sorting order
//treeset does not allow hetrogenious data
		TreeSet<Object> obj=new TreeSet<Object>();
		obj.add(2);
		//obj.add("string");
		System.out.println(obj);
		 //it will show ClassCastException erroe because treeset does not allow hetrogenious data
		TreeSet<Integer> obj1=new TreeSet<Integer>();
		obj1.add(null);
		//after JDK 7 after if we add null then it will show  NullPointerException error
		System.out.println(obj1);
	}

}
