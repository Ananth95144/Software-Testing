import java.util.Arrays;

public class Basic {

	public static void main(String[] args) {
			
		int[] arr = {5, 2, 8, 1, 9, 3};
		for(int i=1;i<arr.length;i++) {
			int minvalue=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>minvalue) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=minvalue;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}