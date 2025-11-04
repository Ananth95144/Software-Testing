package array;

public class Array_Search {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};int value=8, f =0;
		for(int i:arr)
		{
			if(value==i)
			{
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("presented");
		}
		else
		{
			System.out.println("not presented");
		}
	}

}
