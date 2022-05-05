package stringmethod;

public class stringmetho1 {
public static String var="TESTINGT";
public static String var1="testing";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// length is use to find out size of string
		// length is start from 1
		System.out.println(var.length());
		// charAT is use to find out position of character
	// charAt tart from index 0	
		System.out.println(var.charAt(2));
		// shech the string is empty or not
		System.out.println(var.isEmpty()); //when there "is" usr in methosd answer is always boolean
		//wether two sting is equal or not with case sensitivity
		System.out.println(var.equals(var1));
		//wether two sting is equal or not without case sensitivity
		
		System.out.println(var.equalsIgnoreCase(var1));
		//check string statr with tes 
		System.out.println(var.startsWith("TSE"));
		// rae =testing means to createin lower case
		System.out.println(var.toLowerCase());
		//var1=TESTING
		System.out.println(var1.toUpperCase());
		//string method chaining with upper case and start with tes
		System.out.println(var.toUpperCase().startsWith("TES"));
		// string method chaining with uppercase and end
		System.out.println(var.toUpperCase().endsWith("G"));
		
		System.out.println(var.contains("TE"));
String var2="manual test";
System.out.println(var2.replace("manual", "automation"));

// split returns array of string
// split give the value like index staring from 0 as given below
String var5=" ram and sham ggo to school for gaon "; // here 0=ram,1=and.....
System.out.println(var5.split("g")[0]); // here it will not get "g" it will print upto g
                                        // here 0= ram and sham,1=go to school for ,2=gaon
System.out.println(var5.split("g")[2]);		
		
		 //trim is use to removr front and back space in string sentence
		String var7="  he go   ";
		System.out.println(var7.trim());
		
		// index method is give valu int 
		//if index on found it will give value -1
		System.out.println(var.indexOf("E"));
		System.out.println(var.indexOf("te"));//if index on found it will give value -1
		System.out.println(var.indexOf(84)); // it give ascil value of T means we search T by ascil value
		System.out.println(var.indexOf("T",2)); // means search T from index 2 in var
		System.out.println(var.lastIndexOf("T")); // it give last idex of T
		String var40="ram go there for that"; // space also consider for indexing
		int c=var40.indexOf("there");
		System.out.println(var40.substring(c));
		
		System.out.println(var.substring(0, 2)); // here it will substring the var between index 0 and 2 but 
		                                        //it will on print index 0

	}

}
