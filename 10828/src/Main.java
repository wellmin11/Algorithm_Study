import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	private static ArrayList<String> stack = new ArrayList<>();;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String input = br.readLine();

			if (input.contains("push")) {
				String[] pushNum = input.split(" ");
				push(pushNum[1]);
			} else if (input.equals("pop")) {
				pop();
			} else if (input.equals("top")) {
				top();
			} else if (input.equals("empty")) {
				empty();
			} else if (input.equals("size")) {
				System.out.println(stack.size());
			}
		}
	}

	private static void pop() {
		if (stack.size() == 0)
			System.out.println(-1);
		else {
			System.out.println(stack.get(stack.size() - 1));
			stack.remove(stack.size() - 1);
		}
	}

	private static void empty() {
		if (stack.size() == 0)
			System.out.println(1);
		else
			System.out.println(0);
	}

	private static void top() {
		if (stack.size() == 0)
			System.out.println(-1);
		else
			System.out.println(stack.get(stack.size() - 1));
	}

	private static void push(String num) {
		stack.add(num);
	}
}
