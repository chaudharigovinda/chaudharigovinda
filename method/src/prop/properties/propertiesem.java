package prop.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;
import java.io.IOException; //this ioexception is requierd to import for read path-
                            //-so if not see then called it
public class propertiesem {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
Properties pro=new Properties();
pro.load(new FileInputStream("F:\\java\\method\\sellenium\\prop.properties"));
//F:\\java\\method\\sellenium\\prop.properties here- 
//-if we write it as .\\sellenium\\prop.properties then we cant run it on any pc
//means before . it is path of computer upto project name here method is project name
System.out.println(pro.getProperty("url"));
// this means that the valu enterd in file will print here- 
//-so if we change vakue in file then we no need to change value in program 
// in text file url= "www.google.com" means url is key and "www.google.com" in value
// to read we called only key
// we use getproperty method to read the value of key

//if we want to change value of key then as below
//url3="www.whtsapp.com" this was first value which enterd in file 
pro.setProperty("url3","check");// here we changed value of url3=check
System.out.println(pro.get("url3")); 
//but if we want to update this valu in file then we do as below
FileOutputStream test=new FileOutputStream(".\\sellenium\\prop.properties");
pro.store(test, "valuchange");

	}

}
