import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < T; i++) arr.add(sc.nextInt());
		Collections.sort(arr);
		for (int i = 0; i < arr.size(); i++) System.out.println(arr.get(i));
		sc.close();
	}
}
