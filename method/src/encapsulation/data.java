package encapsulation;
 //encapsulation means there are more than one methods variable in calss
public class data {
	// this is private variable so to acess those  variable we have to make is public
	private int balance=500;
	private int deposite;
	private int loaneligibile;
	
	public int getbalance(int account) { // aboveprivate variable so to acess those  variable we have to make is public
		if (account==123) {
			return this.balance;	//balance word is variable of 'private int balance'
			     //this. word is use to call object because we not create object
		}
		else {
			return 0;
		}
		
	}

public int getdeposite() { // aboveprivate variable so to acess those  variable we have to make is public
		
		return this.deposite;
	}

public int loaneligible() {
	
	return loaneligibile; //here this word add by java
}
public void setbalance (int balance) {
	
	this.balance=balance;
}

public void setdeposite (int deposite) {
	
	this .deposite=deposite;
}















}
