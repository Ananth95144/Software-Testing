package oops;

class bike$ {
	String model;
	int amount;

	bike$(String modl, int amt) //
	{
		model = modl;
		amount = amt;
	}

// bike is return type of object
	bike$ doublevlu() {
		bike$ bk = new bike$(model, 2 * amount); // new object
		return bk;
	}
}

public class ConstructorObjectReturnClassObject {

	public static void main(String[] args) {
		bike$ b = new bike$("bajaj", 95_000);
		bike$ bref = b.doublevlu();
		System.out.println(bref.amount);
	}
}
