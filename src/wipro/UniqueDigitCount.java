package wipro;

import java.util.Arrays;

public class UniqueDigitCount {
	public static void main(String[] args) {
		int num = 292333;
		int temp = num;
		int min = 0;
		int count = 0;
		
		int arr[] = new int[10];
		while (temp != 0) {
			arr[temp%10]+=1;
			temp /= 10;
		}
//		String arrstr=Arrays.toString(arr);
//		System.out.println(arrstr);
//		for(int i=0;i<10;i++)
//		{
//			if(arr[i]==1)
//			{
//				min=i;
//			}	
//		}
//		System.out.println(min);
		for(int i=0;i<10;i++)
		{
			if(arr[i]!=0)
			{
				System.out.print(i);
			}	
		}
	}

}
