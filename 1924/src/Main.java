import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int month = sc.nextInt();
		int day = sc.nextInt();

		String[] week = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		String year[][] = new String[12][31];
		int num = 0;
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 31; j++) {
				if (i == 3 && j == 30)
					break;
				if (i == 5 && j == 30)
					break;
				if (i == 8 && j == 30)
					break;
				if (i == 10 && j == 30)
					break;
				if (i == 1 && j == 28)
					break;

				year[i][j] = week[num++];

				if (num == 7)
					num = 0;
			}
		}
		System.out.println(year[month - 1][day - 1]);

	}
}
