package oops;
class Basicconcept
{
	int a;
	public String display(int price)
	{
		if(price>500)
		{
			return "5+1 nos Tshirt";
		}
		return "1 no Tshirt";
	}
}
public class OopsBasic {
	public static void main(String[] args) {
		int price=100;
		Basicconcept obj = new Basicconcept();
		String output = obj.display(price);
		System.out.println(output);
	}

}
