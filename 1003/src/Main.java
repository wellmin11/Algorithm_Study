import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println("1 0");
			}else {
				System.out.println(fibonacci(num - 1)+" "+fibonacci(num));
			}
		}
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
