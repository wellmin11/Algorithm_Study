import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int resultA = ((a % 10) * 100) + ((a % 100) / 10 * 10) + a / 100;
		int resultB = ((b % 10) * 100) + ((b % 100) / 10 * 10) + b / 100;
		
		System.out.println(resultA > resultB ? resultA : resultB);
	}
}
