import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T + 1];
		int[] dp = new int[T + 1];

		for (int i = 1; i <= T; i++)
			arr[i] = sc.nextInt();

		dp[1] = arr[1];
		if (T >= 2)
			dp[2] = dp[1] + arr[2];

		for (int i = 3; i <= T; i++) {
			dp[i] = Math.max(dp[i - 3] + arr[i] + arr[i - 1], dp[i - 2] + arr[i]);
		}

		System.out.println(dp[T]);
	}
}
