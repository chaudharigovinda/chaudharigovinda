package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class sortedem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sortedset  is interface so we cannot creat object
		//sortedset is implements by tressset  class
		//sortedset is group of object in single entity but in sorting order
		//if you dont provide sorting order then sorting order is default asending
		
		TreeSet<Integer> obj=new TreeSet<Integer>();
		obj.add(2);
		obj.add(1);
		obj.add(1);// it is duplicate so it will override
		obj.add(3);
		obj.add(6);
		obj.add(15);
	System.out.println(obj); // so it will print in acsending order
	System.out.println(obj.first());// it will give 1
System.out.println(obj.last());// it will give 15
System.out.println(obj.headSet(3));// it will print less than 3 but not print 3
System.out.println(obj.tailSet(3));// it will print more than 3 and print 3 also
System.out.println(obj.subSet(2, 15));//it will print partial set between satrt and end value -
                                       //-but print star value also

//desending iterator
Iterator<Integer> desending=obj.descendingIterator();// it will print desending order
while(desending.hasNext()) {
	System.out.println(desending.next()); 
}
System.out.println();
//decending order
System.out.println(obj.descendingSet()); // it will print in decending oreder but in row
//ceiling method --- this method print only single element
System.out.println(obj.ceiling(3)); //it will print(retrive) "greater than" or equal to given element
//abve 3 element is given so it will print equal to 3 but below 7 is not given so it will print greater than 7
System.out.println(obj.ceiling(7));

System.out.println(obj.ceiling(17));// it will give because ceiling  rul not follow in given obj values
//floor method will print(retrive) only single value --"less than" or equal to given element
System.out.println(obj.floor(7));//less than because 7 has not given in object 
System.out.println(obj.floor(3));// equal to
System.out.println(obj.floor(-17)); // null because less than value not in object
System.out.println(obj.higher(3));
System.out.println(obj.lower(3));
System.out.println(obj.pollFirst());// it will print( retrive) and delete first element
//first element means in sorting order element means in default it is asending
System.out.println(obj);//this will print( retrive) as like

System.out.println(obj.pollLast());// it will print( retrive) and delete last element
//first element means in sorting order element means in default it is asending
System.out.println(obj);






	}

}
