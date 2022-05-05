package garbege;

public class garbegecollection {
	
	//garbege collection done by java automatically by jvm
static garbegecollection obj; //it is for create static object
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
obj=new garbegecollection();
obj=null; // it will go to garbege collection because it is not accesible to any one

garbegecollection obj1=new garbegecollection();
garbegecollection obj2=new garbegecollection();
obj1=obj2; // here on object between of them will go to garbege collection
// because there is relation


System.gc(); // by this method we can only request to jvm for garbege collection
Runtime.getRuntime().gc(); // it is also for garbege collection
// finalize method use in garbage collection 
 //finally is use in exception
 //final is class ,method, variable
protected void finalize( ) throws Throwable{
	
	// it is wrong to get heip
}

	}

}
