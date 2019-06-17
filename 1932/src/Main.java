import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[][] rgbValue = new int[T + 1][T + 1];
		int[][] dp = new int[T + 1][T + 1];

		for (int i = 0; i < T; i++) {
			for (int j = 0; j <= i; j++)
				rgbValue[i][j] = sc.nextInt();
		}
		dp[0][0] = rgbValue[0][0];

		for (int i = 1; i <= T; i++) {
			dp[i][0] = dp[i - 1][0] + rgbValue[i][0];
			for (int j = 1; j <= i; j++) {
				dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + rgbValue[i][j];
			}
			dp[i][i] = dp[i - 1][i - 1] + rgbValue[i][i];
		}

		int result = 0;
		for (int i = 0; i < T; i++) {
			if (result < dp[T-1][i])
				result = dp[T-1][i];
		}
		System.out.println(result);
	}
}