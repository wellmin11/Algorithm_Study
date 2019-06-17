import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] numArr = br.readLine().toCharArray();
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr.length; j++) {
				if(numArr[i] - '0' > numArr[j] - '0') {
					char temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	}
}
