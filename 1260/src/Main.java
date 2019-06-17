import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	private static int[][] map;
	private static boolean[] visit;
	private static int N, M, V;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] input = br.readLine().split(" ");
			N = Integer.parseInt(input[0]);
			M = Integer.parseInt(input[1]);
			V = Integer.parseInt(input[2]);
			map = new int[N + 1][N + 1];
			visit = new boolean[N + 1];

			for (int i = 0; i < N + 1; i++) {
				Arrays.fill(map[i], 0);
			}
			Arrays.fill(visit, false);

			for (int i = 0; i < M; i++) {
				String edge = br.readLine();
				StringTokenizer st = new StringTokenizer(edge, " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				map[a][b] = map[b][a] = 1;
			}

			dfs(V);
			System.out.println();
			Arrays.fill(visit, false);
			bfs(V);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void bfs(int i) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(i);
		visit[i] = true;
		while (!q.isEmpty()) {
			int temp = q.poll();
			System.out.print(temp + " ");

			for (int j = 1; j <= N; j++) {
				if (map[temp][j] == 1 && visit[j] == false) {
					q.offer(j);
					visit[j] = true;
				}
			}
		}
	}

	private static void dfs(int i) {
		visit[i] = true;
		System.out.print(i + " ");
		for (int j = 0; j < N + 1; j++) {
			if (map[i][j] == 1 && visit[j] == false) {
				dfs(j);
			}
		}

	}
}
