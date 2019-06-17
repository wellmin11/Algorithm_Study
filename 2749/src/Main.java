import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fibonacci(sc.nextLong()));
	}

	private static long fibonacci(long num) {
		int DIV = 1000000;
		int pisano = 1500000;

		num = num % pisano;

		long[] fibo = new long[pisano + 1];
		fibo[1] = 1;

		for (int i = 2; i <= pisano; i++) {
			fibo[i] = (fibo[i - 1] + fibo[i - 2]) % DIV;
		}

		return fibo[(int) num];
	}
}
