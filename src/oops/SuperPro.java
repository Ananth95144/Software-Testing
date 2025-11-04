package oops;
class spr
{
	int val ; // super method
	spr()   // super constructor
	{
		val=50;
		System.out.println("Super constractor ");
	}
	void ptr() // super method
	{
		System.out.println("Super method");
	}
}
class sub extends spr
{
	sub()
	{
		super();
		System.out.println("sub constructor");
	}
	void prnt()
	{
		super.ptr();
		System.out.println(super.val);
		System.out.println("sub method");
	}
}
public class SuperPro {

	public static void main(String[] args) {
		sub obj = new sub();
		obj.prnt();
	}

}
