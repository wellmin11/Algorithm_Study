import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Document {
	private int seq;
	private int importance;

	public Document(int seq, int importance) {
		super();
		this.seq = seq;
		this.importance = importance;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getImportance() {
		return importance;
	}

	public void setImportance(int importance) {
		this.importance = importance;
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] importance = new int[N];
			
			for (int i = 0; i < N; i++) {
				importance[i] = sc.nextInt();
			}
			System.out.println(solution(N,M,importance));
		}

	}

	private static int solution(int N, int M, int[] importance) {
		Queue<Document> q = new LinkedList<>();
		for (int i = 0; i < importance.length; i++) {
			q.add(new Document(i,importance[i]));
		}
		
		int result = 1;
		
		while(true) {
			if(checkImportance(q)) {
				if(q.poll().getSeq() == M) {
					return result;
				}else {
					result++;
				}
			}
		}
		
	}

	private static boolean checkImportance(Queue<Document> q) {
		for (int i = 0; i < q.size(); i++) {
			if(q.peek().getImportance() < ((LinkedList<Document>) q).get(i).getImportance()) {
				q.add(q.poll());
				return false;
			}
		}
		return true;
	}
}
