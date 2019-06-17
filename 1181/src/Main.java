import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		Set<String> set = new HashSet<>();
		for (int i = 0; i < T; i++) {
			set.add(sc.next());
		}
		
		String[] array = new String[set.size()];
		
		set.toArray(array);
		Arrays.sort(array);
		
		Arrays.sort(array, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

