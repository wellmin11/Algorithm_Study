import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int count = T;
		for (int i = 0; i < T; i++) {
			boolean[] isGroup = new boolean[26];
			String word = sc.next();
			
			for (int j = 1; j < word.length(); j++) {
				
				if( word.charAt(j - 1) != word.charAt(j)) {
					if(isGroup[word.charAt(j) - 'a']  == true) {
						count--;
						break;
					}
					isGroup[word.charAt(j - 1) - 'a'] = true;
				}
			}
		}
		
		System.out.println(count);
	}
}
