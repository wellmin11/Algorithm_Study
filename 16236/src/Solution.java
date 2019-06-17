import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	static int n, x, y;
	static int[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
				// �Ʊ� ��� ���� ��ġ
				if (arr[i][j] == 9) {
					x = i;
					y = j;
				}
			}
		}
		// ���� Ž���� �� �ߺ� ����
		visited = new boolean[n][n];
		solve();
	}

	// ������ ���̸� �԰� �ٽ� ���� Ž���� ��
	private static void init() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				visited[i][j] = false;
		}
	}

	static boolean[][] visited;
	static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	private static void solve() {
		Queue<Pair> queue = new LinkedList<>();
		// �ʱ� ũ�� 2
		queue.add(new Pair(x, y, 2, 0, 0));
		visited[x][y] = true;
		// �ɸ� �ð�
		int result = 0;
		while (!queue.isEmpty()) {
			int eatX = 99, eatY = 99; // ���̰� �߽߰� �� ��ġ
			int eat = 0, big = 0, cnt = 0; // for������ �� cnt�� ���ֹǷ�, t�� �ۿ��� ����ϱ� ����
			int size = queue.size();
			// �ּҷ� �����ϸ� �ű⼭ ���� �ٽ� Ž���� �ؾ��ϱ� ������
			// ���� cnt�� ��� ���ش�.
			for (int j = 0; j < size; j++) {
				Pair t = queue.poll();
				for (int i = 0; i < 4; i++) {
					int tx = t.x + dir[i][0];
					int ty = t.y + dir[i][1];
					if (tx < 0 || ty < 0 || tx >= n || ty >= n)
						continue;
					if (visited[tx][ty])
						continue;
					// �� �����δ� ũ�� �� ������
					if (arr[tx][ty] > t.big)
						continue;
					visited[tx][ty] = true;
					queue.add(new Pair(tx, ty, t.big, t.eat, t.cnt + 1));
					// �Ʊ� ���� ���� ���̸� �߰��ϸ�
					if (arr[tx][ty] != 0 && arr[tx][ty] != t.big) {
						// ���ǿ� ���� ���� & ������ �켱��
						if (tx < eatX) {
							eatY = ty;
							eatX = tx;
							eat = t.eat;
							big = t.big;
							cnt = t.cnt + 1;
						} else if (tx == eatX) {
							if (ty < eatY) {
								eatY = ty;
								eatX = tx;
								eat = t.eat;
								big = t.big;
								cnt = t.cnt + 1;
							}
						}
					}
				}
			}
			// eatX�� �ٲ���ٴ°��� �̹� cnt���� �������� �ִٴ� ��.
			if (eatX != 99) {
				eat++; // �Ʊ��� ����
				// ũ�� Ŀ����
				if (eat == big) {
					big++;
					eat = 0;
				}
				// �� ���� ���� ������ �Ʊ� ��� �̵�
				arr[x][y] = 0;
				arr[eatX][eatY] = 9;
				result += cnt; // �ű������ Ž�� �Ÿ�
				x = eatX;
				y = eatY; // �Ʊ� ��� ��ġ �̵�
				init(); // �� Ž���� ���� �湮 �ʱ�ȭ
				queue.clear(); // Ž���ϴ� �͵��� �ʿ� �����Ƿ� ����
				visited[eatX][eatY] = true;
				// �� ��ġ���� �Ʊ��� �ٽ� Ž��
				queue.add(new Pair(eatX, eatY, big, eat, 0));
			}
		}
		System.out.println(result);
	}

	static class Pair {
		int x, y, big, eat, cnt;

		Pair(int x, int y, int big, int eat, int cnt) {
			this.x = x;
			this.y = y;
			this.big = big;
			this.eat = eat;
			this.cnt = cnt;
		}
	}
}