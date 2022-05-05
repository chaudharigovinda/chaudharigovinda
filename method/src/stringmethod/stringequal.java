package stringmethod;

public class stringequal {
public static String var1="A";
public static String var2="A";
public static String var3="a";




public static void main(String[] args) {
		// TODO Auto-generated method stub
String var5=new String("A");
System.out.println(var1==var2); //equal to find out string object are equal or not
System.out.println(var1==var5);// it is false
System.out.println(var1.equals(var2));
System.out.println(var1.equals(var5));// it is in string valu equal so true

System.out.println(var1.compareTo(var2)); //compare use to addition or subtraction of ascil value 
                                           // here both string has same string so it will be 0
// ascil value will get from google
System.out.println(var1.compareTo(var3)); // here var1 ="A" and var3= "a"
	}

}
