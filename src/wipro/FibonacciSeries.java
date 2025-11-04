package wipro;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		int sum=0;
		for(int i=0;i<=10;i++)
		{
//			System.out.println(a);
			sum+=a;
			System.out.println(sum);
			c=a+b;
			a=b;
			b=c;

		}
	}
}

/*swaping
 * fibonacci series
 * nth fibonacci
 * sum of nth fibonacci
 */