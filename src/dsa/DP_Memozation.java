package dsa;

import java.util.Arrays;

public class DP_Memozation {
	static int fib(int n,int memo[]) {
	    if (n <= 1) return n;
	    if (memo[n] != -1) return memo[n];
	    return memo[n] = fib(n-1,memo) + fib(n-2,memo);
	}
	public static void main(String[] args) {
		int n=8;	
		int[] memo = new int[n+1];
		Arrays.fill(memo, -1);
		System.out.println(fib(n,memo));
		
	}
}
