import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fibonacci(sc.nextInt()));
	}

	private static long fibonacci(int num) {
		long[] arr = new long[num+1];
		arr[1] = 1;
		if (num <= 1)
			return num;
		for (int i = 2; i <= num; i++) {
			arr[i] = arr[ i -1 ]+ arr[ i -2];
		}
		return arr[num];
	}
}
