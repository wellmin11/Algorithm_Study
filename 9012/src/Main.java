import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			boolean isVps = false;
			String str = br.readLine();
			Stack<Character> stack = new Stack<>();

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == ')') {
					if(!stack.isEmpty())
						stack.pop();
					else {
						isVps = true;
						break;
					}
				} else {
					stack.push(str.charAt(j));
				}
			}
			
			if (stack.isEmpty() && !isVps)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
