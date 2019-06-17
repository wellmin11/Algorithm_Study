import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String str[] = new String[T];
		int count[] = new int[T];
		
		for (int i = 0; i < T; i++) {
			count[i] = sc.nextInt();
			str[i] = sc.next();
		}

		
		for (int i = 0; i < str.length; i++) {
			char[] arr = str[i].toCharArray();
			
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < count[i]; j2++) {
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
		
		sc.close();	
	}
}
