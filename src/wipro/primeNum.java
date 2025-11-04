package wipro;
public class primeNum {
	static Boolean isPrime(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 100;
		int nthprime = 3;
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				count++;
				if (count == nthprime)
					System.out.println(i);
			}
		}
	}
}
