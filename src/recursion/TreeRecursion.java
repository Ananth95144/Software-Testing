package recursion;
public class TreeRecursion {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Multiple recursive calls
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7-1)); // Output: 13 
    }
}
