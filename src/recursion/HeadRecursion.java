package recursion;

public class HeadRecursion {
		static	void print(int n)
		{
			if(n==0){return;	} // base case
			print(n-1); // recursive case
			System.out.println(n); // process
		}
	public static void main(String[] args) {
		print(10);
		
	}

}
