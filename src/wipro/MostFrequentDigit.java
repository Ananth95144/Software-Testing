package wipro;

import java.util.Scanner;

public class MostFrequentDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[10];
		int input[] = new int[4];
		int temp=0;
		int index=0;
		for (int i = 0; i < 4; i++) {
			input[i] = scan.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			while (input[i] != 0) {
				arr[input[i] % 10] += 1;
				input[i] /= 10;
			}
		}
		for(int i=0;i<10;i++)
		{
			if(arr[i]>temp)
			{
				temp=arr[i];
				index=i;
			}	
		}
		System.out.print(index);

	}

}
