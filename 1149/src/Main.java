import java.util.Scanner;
/** 
 * ����
RGB�Ÿ��� ��� ������� ���� ����, �ʷ�, �Ķ��߿� �ϳ��� ĥ�Ϸ��� �Ѵ�. ����, �׵��� ��� �̿��� ���� ������ ĥ�� �� ���ٴ� ��Ģ�� ���ߴ�. �� i�� �̿��� �� i-1�� �� i+1�̴�.

�� ���� �������� ĥ�� �� ��� ���, �ʷ����� ĥ�� �� ��� ���, �Ķ����� ��� ����� �־��� ��, ��� ���� ĥ�� �� ��� ����� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� �� N�� �־�����. N�� 1,000���� �۰ų� ����. ��° �ٺ��� N���� �ٿ� �� ���� �������� ĥ�� ��, �ʷ����� ĥ�� ��, �Ķ����� ĥ�� �� ��� ����� �־�����. ����� 1,000���� �۰ų� ���� �ڿ����̴�.

���
ù° �ٿ� ��� ���� ĥ�� �� ��� ����� �ּڰ��� ����Ѵ�.
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
