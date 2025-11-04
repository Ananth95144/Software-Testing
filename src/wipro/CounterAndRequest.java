package wipro;

public class CounterAndRequest {

	public static void main(String[] args) {
		int counter=5;
		int request=27;
		int reminder=0;
		int temp=0;
		for(int i=counter;i>0;i--)
		{
			temp=request%i;
			if(temp>reminder)
			{
				reminder=temp;
			}
		}
		System.out.println(reminder);
	}
}
