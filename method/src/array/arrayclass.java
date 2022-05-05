package array;

import java.lang.reflect.Array;

//array is use to store more number of value in same datatype
public class arrayclass {

	
	static int b[];//this is array declaration in single dimention
	static int c[]= {1,2,3}; //array initialization with declaration
	static int add[];
	int mark[];// instance array
	static int percentage[];
	int[]d= {1,2,3};
	static int j[]= {0,0,0};
	int k[];
	static int m[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b=new int[5]; // aray initialization 
       //above is arrayname=new datatype[size];
		add=new int[100];
		add[0]=1; 
		add[1]=2;
		add[2]=3;
		add[3]=4; //so on upto 100
		//add[index assign to 1]=1 it is size
		//array always start with 0
		//so in 100 size last array size is size-1 means 100-1=99
	//or we can write as
		
	for (int i=0;i<100;++i) {// i<100means it will have valu only 0 to 99 only not 100 beacause-
		                     //we not use equal sign 
		//here we cannot use i<=100 because last indext is 99
			
			add[i]=i+1;
		}
		System.out.println(" fisrt add" +add[0]); //this assign to 1 after run. here i=0 so it will 0+1
		System.out.println(" second add" +add[1]);//here i=1,so it will 1+1
		System.out.println(" 100 add" +add[99]); // last size is 100
	
		
		arrayclass obj=new arrayclass();
		obj.mark=new int [6]; //instance arry initialization
           obj.mark[5]=50;
           //if we write as like index is more than size obj.mark[7]=50; 
           //then it will show error arrayindexoutofofbonderro
           for(int j=0;j<6;++j) {
        	  obj. mark[j]=j+1;
        	   System.out.println(obj.mark[j]);
        	   
           }
        	   //System.out.println(percentage[1]); //that will show reeor nullpointexception error -
                                  //if we don't initialize the arry
           
         //  lenght word is use to find out size of arrya
           System.out.println(add.length);
           for(int j=0;j<obj.mark.length;++j) {  //to find of size /lenght we have modified this for loop 
        	   System.out.println(obj.mark[j]);}
           
          // iterating vlue through 'for each loop'
        //   it loop use  to show each valu of iteration
           for(int i:c) {
        	   System.out.println(i);
        	   
           }
           
           System.out.println(c.toString());
         //  for inatance array
          // for(int j:obj.mark) {
        	   //System.out.println(j);
           //}
           obj.d=new int[2];
          obj. d[0]=1;
          obj.d[1]=2;
          System.out.println(obj.d[1]);
        
          for(int i:j) {
        	  System.out.println(i);
          }
           for(int a=0; a<=obj.d.length;++a) {
        	  System.out.println(a); 
           }
           obj.k=new int [5];
           for(int i=0;i<5;++i) {
        	   obj.k[i]=i+1;
        	   System.out.println(obj.k[i]);
           }
           m=new int[100];
           
          
           for(int i=0;i<100;++i) {
        	   m[i]=i+1;
        	   System.out.println(i);
           }
           System.out.println();
           
}
}
