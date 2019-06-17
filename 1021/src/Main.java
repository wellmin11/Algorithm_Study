import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			String[] NandM = br.readLine().split(" ");
			int N = Integer.parseInt(NandM[0]);
			int M = Integer.parseInt(NandM[1]);
			int result = 0;
			Deque<Integer> deque = new LinkedList<>();

			for (int i = 1; i <= N; i++) {
				deque.add(i);
			}

			String[] selectNum = br.readLine().split(" ");
			for (int i = 0; i < M; i++) {
				int num = Integer.parseInt(selectNum[i]);

				int idx = 0;
				Iterator<Integer> it = deque.iterator();
				while (it.hasNext()) {
					if (it.next() == num)
						break;
					idx++;
				}

				if (idx == 0) {
					deque.pollFirst();
				} else if (deque.size() / 2 >= idx) {
					for (int j = 0; j < idx; j++) {
						deque.addLast(deque.pollFirst());
						result++;
					}
					deque.pollFirst();

				} else {
					for (int j = 0; j < deque.size() - idx; j++) {
						deque.addFirst(deque.pollLast());
						result++;
					}
					deque.pollFirst();

				}
			}
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
