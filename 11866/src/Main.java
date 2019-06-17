import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		Queue<Integer> q = new LinkedList<>();
		int[] result = new int[N];
		int resultCnt = 0;

		for (int i = 1; i <= N; i++)
			q.offer(i);

		while (!q.isEmpty()) {
			for (int i = 0; i < M - 1; i++) {
				int num = q.poll();
				q.offer(num);
			}
			result[resultCnt++] = q.poll();
		}

		System.out.print("<");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			if (i != result.length - 1)
				System.out.print(", ");
		}
		System.out.print(">");

	}
}
