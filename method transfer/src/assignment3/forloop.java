package assignment3;

public class forloop {

	public static void main(String[] args) {
		// Whether number is prime or not
		int num1=11;
		boolean flag=true; //if false then it will show not prime no
		for (int i=2;i<=num1/2;++i) { // num/2 that means it run for one time only
		if(num1%i==0) {
			flag=false;// above flag =true so at this stage flag =false 
			break;
		}
		
		if(flag)
			System.out.println(num1+"prime number");
		else
			System.out.println(num1+"not prime number");
		}
		
		
		
		
		//for loop for reverse number from 10 to 1
		
	for(int a=10;a>=1;--a) {
		
		System.out.println(a);
		
	}
	
	// sum of first 10 natural number
	int nsum=0;// starting for plus
	for(int nanum=1;nanum<=10;++nanum) { // a is first natural number
		nsum+=nanum;//+ means add nanum in nsum
		
		//nanum == natural number
		// nsum== natural  no sum
	
		System.out.println(nsum);  // take nsum in bracket
	
	}
	
	int num=5;
	
	for (int i=1;i<=10;++i)
	{
		
		System.out.println(num+"x"+i+"="+num*i);
		
		
		
	}
	//fibonacci number
	int total=10; //total 10 fibonacci number to be 
	int fn=0; // first no
	int next=1;// fibonacci number start with 0 or 1 always  
	            //and next number is equal to additon with first number such as 0,1,1,2,3,5....
	
	for(int i=1;i<=total;++i) {

		int sum= fn+next;
		
		fn=next;
		next=sum;
		
		System.out.println("fibonacci number" + sum);
	}
	
	
	
	}
	
		
	}



	


