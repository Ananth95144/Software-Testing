package array;

public class Array_length {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};int len=0;
		for(int i:arr)
		{
			len++;
		}
		System.out.println(len);
		len=0;
		int arry [][]= {{1,2,3},{4,5,6}};
		for(int i[]: arry)
		{
			for(int j: i)
			{
				len++;
			}
		}
		System.out.println(len);
	}

}
