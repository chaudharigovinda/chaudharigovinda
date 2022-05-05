package encapsulation;

public class capsul2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
data obj=new  data(); //this object of data class

int a=obj.getbalance(123 );// int a because getbalance method is returntype
System.out.println(" balnce"+ a);
//if we put wrong account number as showen if if else condition in data class then it show 0
obj.setbalance(1000); //if wee' public void setbalance (int balance) {
	
	                       //this.balance=balance;}' here we have chang number of 'int balance' 
                           // meanse we have add mony as example          
 a=obj.getbalance(123); //as we have written int a above-
                          //so at this line we cannot type int a for duplicte error
 System.out.println("balance"+ a);
	}

}
