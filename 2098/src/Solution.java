import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	static int N;
	static int[][] W = new int[16][16];

	static final int INF = 100000000;
	static final int SOURCE = 0;
	static final int NOT_CONNECTED = 0;
	static final int NOT_VISITED = -1;

	static int[][] dp = new int[16][1 << 16];

	static {
		for (int i = 0; i < 16; i++) {
			Arrays.fill(dp[i], NOT_VISITED);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				W[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		System.out.println(solve(SOURCE, 1 << SOURCE));
	}

	static int solve(int cur, int B) {
		if (dp[cur][B] != NOT_VISITED)
			return dp[cur][B];
		
		// 끝났을 때 순회가 되었는지 확인 
		if (B == (1 << N) - 1) {
			return dp[cur][B] = W[cur][SOURCE] != NOT_CONNECTED ? W[cur][SOURCE] : INF;
		}

		dp[cur][B] = INF;
		for (int i = 0; i < N; i++) {
			if (W[cur][i] == NOT_CONNECTED || (B & (1 << i)) > 0)
				continue;
			dp[cur][B] = Math.min(dp[cur][B], solve(i, B | (1 << i)) + W[cur][i]);
		}
		return dp[cur][B];

	}
}
