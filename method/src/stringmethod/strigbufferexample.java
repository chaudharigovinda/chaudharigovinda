package stringmethod;

public class strigbufferexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer obj1=new StringBuffer(); // with no parametrr
System.out.println(obj1.length());

StringBuffer obj=new StringBuffer("this is");
		// here ist counts space also when we count length
System.out.println(obj1.length());
// stringbuffer maethods

// all strigbuffer method use cosole foe operation
// append method =use for joining
System.out.println(obj.append(65656)); // it is char method append
System.out.println(obj.append(true)); // it is boolean method of append


//delete method
System.out.println(obj.delete(0, 10)); // it will delete 0 to 10 but will remain 10 character
                                         // it will count like indexind
//delete will delete from consolue output

System.out.println(obj.deleteCharAt(2)); // it will delet from last console output
System.out.println(obj.insert(2, "example")); //it will insert word before 2
System.out.println(obj.replace(2, 5, "ram"));// it will replace word but will remoave first valu means remave 2 index
System.out.println(obj.reverse());
	}

}
