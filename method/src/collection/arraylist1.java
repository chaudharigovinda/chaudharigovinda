package collection;

import java.util.ArrayList;

public class arraylist1 {
 //arraylist is class it allow hetrogenious data and follow insertion order
	// it has list properties. 
	//list is group of object and allow duplicate object and follow insertion order
	//it has collection properties
	// collection is group of object in single entity
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int [] a=new int [3];
a[0]=1;
//a[1]="stri" it will show error because array allow only homogenious data
int b=3; //it is premitive variable
ArrayList<Object> obj=new ArrayList<Object>();
//add is method of arraylist and collection also

obj.add(3);// it has index 0

obj.add("string");//it has index 1
obj.add(45);// it has index 2
//here index order follow from first add 
//if we change add  then index remain same only its value change 
//here we added var and string in arraylist so it is hetrogenious data
// because it is collection type

System.out.println(obj.get(0)); //it give index as per above
System.out.println(obj.get(1));
System.out.println(obj); // it shows whole  add parameter

	}

}
