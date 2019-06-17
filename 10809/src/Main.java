import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toLowerCase();
		
		int[] arr = new int[26];
		for (int i = 0; i < arr.length; i++) arr[i] = -1;
		
		for (int i = 0; i < word.length(); i++) {
			int alpa = word.charAt(i) - 'a';
			if(arr[alpa] == -1) arr[alpa] = i;
		}
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
