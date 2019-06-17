import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int arr[][] = new int[1001][1001];
		arr[1][0] = arr[1][1] = 1;

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j || j == 0) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
				
				arr[i][j] %= 10007;
			}
		}
		System.out.println(arr[n][k]);
		
	}
}
