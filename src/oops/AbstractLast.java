package oops;
abstract class Bikes
{
	abstract void Welcome();
	void model()
	{
		System.out.println("");
	}
}

class Bajaj extends Bikes
{
	public int name;
	int age;
	public void Welcome()
	{
		System.out.println("Welcome to Bajaj");
	}
	public Bajaj()
	{
		System.out.println("public constructor");
	}
	Bajaj(int b)
	{
		System.out.println("default access constructor");
	}
}
class Yamaha extends Bikes
{
	public void Welcome()
	{
		System.out.println("Welcome to Yamaha");
	}
}
class Hero extends Bikes
{
	public void Welcome()
	{
		System.out.println("Welcome to Hero");
	}
}
public class AbstractLast {

	public static void main(String[] args) {
		
		Bikes []arr = new Bikes[3];// only array type only can create abstract class object
    	arr[0]=new Bajaj (); // passing sub class object to super class
    	arr[1]=new Yamaha ();
    	arr[2]=new Hero ();
    	for(Bikes b:arr) // b is normal object but having sub class values
    	{
    		b.Welcome();
    	}
    	Bajaj b = new Bajaj();
    	b.Welcome(); 
	}
}
