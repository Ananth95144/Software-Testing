package oops;
enum Laptop{ // Laptop is a class
	Asus(30000),Lenovo(40000),Dell(50000),Mac(20000),Aser; // Asus is a namevalue & 30000 is value
	private int price;// instance variable
	
	private Laptop() // constructor  , can access only aser
	{
		price=10000; // default value by constructor
	}
	private Laptop(int p)// constructor with parameter  , can't access aser 
	{
		price = p; 
	}
	int getPrice() 
	{
		return price;
	}
	void setPrice(int sp)
	{
		price = sp;
	}
}
public class Enumeration {

	public static void main(String[] args) {
		Laptop l = Laptop.Mac;
    	System.out.println(l+" : "+l.getPrice()); // l is variable and l.getPrice is variable value
    	System.out.println(l.ordinal());
    	System.out.println(l.name());
//    	System.out.println(l.values());
    	System.out.println(l.toString());
    	Laptop ll = Laptop.Asus;
    	System.out.println(ll.compareTo(l));
    	Laptop lll = Laptop.Mac;
    	System.out.println(lll.compareTo(l));
//    	if(l == Laptop.Lenovo)
//    	{
//    		System.out.println(l);
//    	}
//    	else if(l == Laptop.Aser)
//    	{
    	
//    		System.out.println(l);
//    	}
//    	else { System.out.println("not valid");}
//    	switch(l)
//    	{
//    	case Lenovo:System.out.println(l);break;
//    	case Aser : System.out.println(l);break;
//    	default:System.out.println("pass only valid value");
//    	}
    		
    	for(Laptop prt : Laptop.values()) // passing namevalue to class in array format
    	{
    		System.out.println(prt+" : "+ prt.getPrice());
    	}
	}

}
