import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fibonacci(sc.nextInt()));
	}

	private static int fibonacci(int num) {
		int a = 0;
		int b = 1;
		int temp = 0;

		if (num <= 1)
			return num;
		for (int i = 0; i < num - 1; i++) {
			temp = b;
			b = a + b;
			a = temp;
		}
		return b;
	}
}
