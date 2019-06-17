import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().trim().toLowerCase();
		int alpa[] = new int[26];
		
		for (int i = 0; i < word.length(); i++) {
			int a = word.charAt(i) - 'a';
			int b = alpa[a];
			alpa[a] = ++b;
		}

		int max = 0;
		int maxIdx = 0;
		
		for (int i = 0; i < alpa.length; i++) {
			if(max < alpa[i]) {
				max = alpa[i];
				maxIdx = i;
			}
		}
		
		for (int i = 0; i < alpa.length; i++) {
			if( i != maxIdx && alpa[maxIdx] == alpa[i]) {
				System.out.println("?");
				System.exit(0);
			}
		}
		
		char a = (char) (maxIdx + 'a');
		System.out.println(String.valueOf(a).toUpperCase());
	}
}	
