package recursion;

public class IndirectRecursion {
	static void a(int n) { 
		if(n<11)
		{
			System.out.println(n);
			b(n+1);
		}
	}
	static void b(int n) {
		if(n<11)
		{
			System.out.println(n);
			a(n+2);
		}
	}
public static void main(String[] args) {

	a(1);
}
}
