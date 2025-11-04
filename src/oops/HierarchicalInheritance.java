package oops;
class super1
{
	void method1()
	{
		System.out.println("base class");
	}
}
class super2 extends super1
{
	void method2()
	{
		System.out.println("base class");
	}
}
public class HierarchicalInheritance extends super1
{	
	void method3()
{
	System.out.println("base3 class");
}

	public static void main(String[] args) {
		HierarchicalInheritance obj = new HierarchicalInheritance();
		obj.method1();
		obj.method3();
		
	}
}
