package recursion;

public class DirectRecursion {
	   public static void recursion(int n) {
	        if (n<11) {
	           System.out.println(n);
	           recursion(n+1);
	        }
	        return;
	    }
	public static void main(String[] args) {
		recursion(1);
	}

}
