import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(bincoeff(n, k));
	}

	private static int bincoeff(int n, int k) {
		if (n == k || k == 0)
			return 1;
		else
			return bincoeff(n - 1, k - 1) + bincoeff(n - 1, k);
	}
}