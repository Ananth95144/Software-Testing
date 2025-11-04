package oops;
class hierachical
{
	void method1()
	{
		System.out.println("output 1");
	}
}
class hierachical1 extends hierachical
{
	hierachical h1obj = new hierachical();
	void method2()
	{
		System.out.println("output 2");
	}
}
class hierachical2 extends hierachical
{
	hierachical h2obj = new hierachical();
	void method3()
	{
		System.out.println("output 2");
	}
}
public class HybridInheritance extends  hierachical2
{

	void method()
	{
		System.out.println("output 0");
	}
	public static void main(String[] args) {
		HybridInheritance obj = new HybridInheritance();
		obj.method();
		obj.method1();
		obj.method3();
		hierachical1 obj1 = new hierachical1();
		obj1.method1();
		obj1.method2();
	}
}
