import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<>();

		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		int[] result = new int[4];
		int totalNum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			totalNum += arr[i];
			list.add(arr[i]);
		}

		result[0] = totalNum / T;

		Collections.sort(list);
		
		if (T % 2 == 0)
			result[1] = list.get(T / 2 - 1);
		else
			result[1] = list.get(T / 2);
		
		
		result[3] = list.get(T - 1) -  list.get(0);

		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}
}
