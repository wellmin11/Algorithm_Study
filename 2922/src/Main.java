import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int result = 1;
		int roomNum = 1;
		int addNum = 6;

		while (true) {
			if (N <= roomNum)
				break;

			roomNum += addNum;
			addNum += 6;
			result++;
		}

		System.out.println(result);
	}
}
