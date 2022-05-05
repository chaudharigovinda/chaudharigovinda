package collection;

import java.util.WeakHashMap;

public class weakhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WeakHashMap is use for if there is null then it will send to garbage collection
		 weakhashmap obj=new  weakhashmap();
WeakHashMap< weakhashmap, String> obj1=new WeakHashMap< weakhashmap, String>();
obj1.put(obj, "testing");
System.out.println(obj1);
obj=null;// it will eligible for garbage collection(gc)
System.gc();// we can request to call gc to jvm but not force it
System.out.println(obj1);
	}
	
	class Test{
		
		public String toString(){
			return "test";
			  
		}
		// finalized method use in collection
		protected void finalize () throws Throwable{
			System.out.println(" this is finalized ");
			
		}
	}

}
