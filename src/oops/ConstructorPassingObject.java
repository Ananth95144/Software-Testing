package oops;
class Car{
	int modelNo;
	String carName;
	int amount;
	Car(int model,String name,int amt) // passing parameter to instance variables by constructor
	{
		modelNo=model;
		carName=name;
		amount=amt;
	}
	void setprize(int modelNo,String carName,int amount) // using this method passing values
	{
		this.modelNo=modelNo;
		this.carName=carName;
		this.amount=amount;
	}
	Car(Car OB) // passing object as parameter 
	{
//    C2 object =  C1 object   it is called copy constructor
		modelNo = OB.modelNo; 
		carName = OB.carName;
		amount  = OB.amount;
	}
	boolean isequal(Car o) // getting parameter as object then compare two object
	{
//        c object == c1 object
		if(modelNo == o.modelNo && carName==o.carName && amount==o.amount)
		{
			return true;
		}
		return false;
	}
}
public class ConstructorPassingObject
{	
	public static void main(String [] args)
	{
		Car c = new Car(24,"suziki",24_00_000);
		
		c.setprize(1,"toyata",2_00_000);
		Car c1 = new Car(1,"toyata",2_00_000);
		System.out.println(c.isequal(c1));
		Car c2= new Car(c1);
		System.out.println(c2.carName);
	}
}