package array;

public class multidimearry {
 public static int []arra; //1 d arry
 public  static int[] []arra1; // 2d array
 public  static int[] [][]arra2; //3d array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	arra1=new int [2][2];	//2 d array initialization 
	
	//we have to provide size as per dimention meand 2 d then provide 2 dimetion as above
	arra1[0][0]=5;	
	arra1[0][1]=15;	
	arra1[1][0]=25;		// it is row and column format for arry 
	arra1[1][1]=35;	// firs no represent row second no represent colomn
	//arra1[1][2]=12; // this show error because column are  is 0 and 1
	// also rows are 0 and 1
	//similARarly for 3d array 3 rows as=0,1,2 and coloumn are 3as =0,1,2 for 4 d array will add 3after 2
	for (int i=0;i<2;++i) {// i<2means it will have valu only 0,1 only not 2 beacause we not use equal sign
		
		System.out.println(arra1[i][0]); //means it show valu of [0][0] and [1][0] 
				                           //here i represent  first valu of both
		System.out.println(arra1[i][1]);//means it show valu of [0][1] and [1][1] 
                                               //here i represent  first valu of both
	}
	//for make pattern *
	               //  **
	                // ***
	for (int i=0;i<3;++i) {
		for (int j=0;j<=i;++j) {// this loop depend upon above loop 
		// so when  above valui =0 then this loop will run for 1 time when above for 1 then this run for 2 time 
		System.out.print("*"); // we use print only not println so it will run in one row
			
		}
		System.out.println(); // it is for to go next line beacuse we wus println in this
	}
	
	
	
	}

}
