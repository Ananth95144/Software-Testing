package wipro;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int binary = 100;
		int decimal=0;
		int rem =0;
		int i=0;
		while(binary!=0)
		{
			rem=binary%10;
			if(rem==1) {
			decimal+=rem*Math.pow(2, i);
			}
			i++;
			binary/=10;
		}
		System.out.println(decimal);
	}

}
