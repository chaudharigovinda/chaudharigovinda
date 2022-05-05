package scanner;

import java.util.Scanner;

public class scanner1 {
 //scanner is use to take valu from console means we have -
	//to wrote valu on cosole after run and then press enter
	// when writing on consol write from first program means here write from odd even value program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" odd or even");
		Scanner obj=new Scanner(System.in);
		//System .in means we have to give input on consol
int var=obj.nextInt();
if(var%2==0) {
	
	System.out.println(" even"); //System.out means we get valu on consol
}else {
	System.out.println("odd");
}
int var1=obj.nextInt();


if (var1>1) {
	System.out.println("plus");
}

// string use with scanner
System.out.println(" string valu");
String var3=obj.next(); // next only here  so it call only first name of sentence
System.out.println(var3);
System.out.print(" next string");
String var4=obj.nextLine(); // nextline means it call full sentence
System.out.println();
System.out.print(var4);


	}


}

 // when writing on consol write from first program means here write from odd even value program