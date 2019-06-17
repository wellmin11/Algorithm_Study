import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int result = 1;

		for (int i = 0; i < 3; i++)
			result *= sc.nextInt();

		char[] num = String.valueOf(result).toCharArray();
		for (int i = 0; i < num.length; i++) {
			int n = num[i] - '0';
			arr[n]++;
		}

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		sc.close();
	}
}
