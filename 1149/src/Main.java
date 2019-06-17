import java.util.Scanner;
/** 
 * 문제
RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 집 i의 이웃은 집 i-1과 집 i+1이다.

각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 집의 수 N이 주어진다. N은 1,000보다 작거나 같다. 둘째 줄부터 N개의 줄에 각 집을 빨강으로 칠할 때, 초록으로 칠할 때, 파랑으로 칠할 때 드는 비용이 주어진다. 비용은 1,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 모든 집을 칠할 때 드는 비용의 최솟값을 출력한다.
 * @author user
 * https://www.acmicpc.net/problem/1149
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[][] rgbValue = new int[T + 1][3];
		int[][] dp = new int[T + 1][3];

		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 3; j++)
				rgbValue[i][j] = sc.nextInt();
		}

		dp[0][0] = rgbValue[0][0];
		dp[0][1] = rgbValue[0][1];
		dp[0][2] = rgbValue[0][2];

		for (int i = 1; i <= T; i++) {
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + rgbValue[i][0];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + rgbValue[i][1];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + rgbValue[i][2];
		}

		System.out.println(Math.min(Math.min(dp[T - 1][0], dp[T - 1][1]), dp[T - 1][2]));
	}
}
