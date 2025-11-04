package oops;
class test{
	int carNo;
	int carPrize;
	String carModel;
	test(int no, int prize, String model){ // creating class name as method name
		carNo = no;
		carPrize=prize;
		carModel=model;
	}
}
public class constructor {

	public static void main(String[] args) {
		test dobj = new test(10,100000,"R"); // passing value to the constructor inside class parenthesis
		System.out.println(dobj.carNo);
		System.out.println(dobj.carPrize);
		System.out.println(dobj.carModel);

	}
}
