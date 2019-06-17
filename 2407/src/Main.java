import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	private static BigInteger[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		BigInteger big = new BigInteger("1");
		arr = new BigInteger[1001][1001];
		
		arr[1][0] = arr[1][1] = big;
		boolean isOver = false;
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				if(i == j || j == 0) {
					arr[i][j] = big;
				}else {
					arr[i][j] = arr[i -1][j -1].add(arr[i-1][j]);
				}
				if(i == n && j == m) {
					isOver = true; 
					break;
				}
			}
			if(isOver)
				break;
		}
		
		System.out.println(arr[n][m]);
	}
}
