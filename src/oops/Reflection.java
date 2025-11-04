package oops;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
 abstract class Bikess
{
	abstract void Welcome();
	void model()
	{
		System.out.println("");
	}
}
class Bajajj extends Bikess
{
	public void Welcome()
	{
		System.out.println("Welcome to Bajaj");
	}
	void model()
	{
		System.out.println("");
	}
}
public class Reflection {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// reflection
		Bikess []arr = new Bikess[3];// only array type only can create abstract class object
    	arr[0]=new Bajajj (); // passing sub class object to super class
    	Bajajj bb = new Bajajj();
	 	System.out.println(arr[0].getClass()); // printing class name
    	System.out.println(arr[0].getClass() == bb.getClass()); // check both class are same
    	System.out.println(bb instanceof Bajajj); // check b is the object  Bajaj class
 //------------------------------------------------------------------------------------------------------------
// 								Get class details of bajaj
//printing class name with package 
    	// Class is default class in reflection
    	Class cls = bb.getClass(); 
    	System.out.println(cls.getName());
//printing methods
    	// Method is default class in reflection
    	Method[] m = cls.getMethods(); // methods  declared as public only can access
    	for(Method prt :m)
    	{
    		System.out.println(prt.getName()); // welcome is in Bajaj and rest of all are in Object class
    	}
    	Method[] mm = cls.getDeclaredMethods(); // Methods what we declared in private, default, public
    	for(Method prt :mm)
    	{
    		System.out.println(prt.getName()); 
    	}
    	Constructor[] c=cls.getConstructors();// constructor  declared as public only can access
    	for(Constructor prt :c)
    	{
    		 System.out.println(prt);
    	}
    	Constructor[] cc=cls.getDeclaredConstructors();// constructor what we declared in private, default, public
    	for(Constructor prt :cc)
    	{
    		 System.out.println(prt);
    		 System.out.println(prt.getParameterCount());
    	}
    	Field [] f=cls.getFields();
    	for(Field pnt : f)
    	{
    		System.out.println(pnt);
    	}
    	Field [] ff=cls.getDeclaredFields();
    	for(Field pnt : ff)
    	{
    		System.out.println(pnt);
    	}
//access method indirectly                                                                                                                   
//    	try {
//    		  m[0].invoke(bb, null);
//    		} catch (Exception e) { System.out.println(e);}
//    		  
	}

}
