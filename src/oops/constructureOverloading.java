package oops;

public class constructureOverloading {

	int tshirtPrize;
	int ShirtPrize;
	int PantPrize;
	
	constructureOverloading()
	
	{
		tshirtPrize=150;
		ShirtPrize=250;
		PantPrize=450;
	}
	constructureOverloading(int a, int b, int c)
	{
		tshirtPrize=a;
		ShirtPrize=b;
		PantPrize=c;
	}
	constructureOverloading(int a)
	{
		tshirtPrize = ShirtPrize =	PantPrize = a;
	}
	public static void main(String[] args) {
		constructureOverloading conovrobj = new constructureOverloading();
		System.out.println("tshirtPrize: "+conovrobj.tshirtPrize);
		System.out.println("shirtPrize: "+conovrobj.ShirtPrize);
		System.out.println("pantPrize: "+conovrobj.PantPrize);
		constructureOverloading conovrobj1 = new constructureOverloading(100,300,750);
		System.out.println(conovrobj1.tshirtPrize);
		System.out.println(conovrobj1.ShirtPrize);
		System.out.println(conovrobj1.PantPrize);
		constructureOverloading conovrobj2 = new constructureOverloading(200);
		System.out.println("tshirtPrize: "+conovrobj2.tshirtPrize);
		System.out.println("shirtPrize: "+conovrobj2.ShirtPrize);
		System.out.println("pantPrize: "+conovrobj2.PantPrize);
	}
}
