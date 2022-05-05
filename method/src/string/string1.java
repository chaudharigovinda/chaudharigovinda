package string;

import array.arrayclass;
//string declartion
public class string1 {
	
	
	
	
public static String var1; // static string
public static arrayclass var2;// non premitive data type
public  int  var3=5; //it is decla= init it is call literal integer
public String var4;// instance string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
var1=new String(" bad");// string initialization
System.out.println(var1);
String a="tesh"; // dicla+initi

//String b=5; // it show error because string has only text
String c= var1.concat("man");
System.out.println(c); // concat is use for two similar tring it joint string of line 12and17

string1 obj=new string1();
obj.var4=new String("instance ");
System.out.println(obj.var4);
//string is immutable means when you write string you cannot change it 
//if you want to make string mutable you have to create string buffer class as below
	
StringBuffer abc =new StringBuffer("ra");

abc.append("m");
System.out.println(abc);



	}
//hrere there are two memory in string HEAP AND SCP(STRING CONSTANT POOL)
//when use of new word object is creat


	
	
	
	
}
