import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			HashMap<String, Integer> map = new HashMap<>();
			for (int j = 0; j < n; j++) {

				String name = sc.next();
				String kind = sc.next();

				if (map.containsKey(kind)) {
					map.put(kind, map.get(kind) + 1);
				} else {
					map.put(kind, 1);
				}
			}
			int result = 1;
			for (int value : map.values()) {
				result *= value + 1;
			}

			System.out.println(result - 1);
		}

	}
}
