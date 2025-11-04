package wipro;

public class DecimalToBinary {

	public static void main(String[] args) {
		byte decimal=4;
		int check=0;
		String binary="";
		for(int i=8;i>=0;i--)
		{
			check=decimal>>i;
			if((check&1) ==1)
			{
				binary=binary+"1";
			}
			else
			{
				binary=binary+"0";
			}
		}
		
		System.out.println(binary);
	}

}
