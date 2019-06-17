import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] arr = new int[N];
		int cnt = 0;
 		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if(num < X)
				arr[cnt++] = num;
		}
 		
 		for (int i = 0; i < cnt; i++) {
 			if(i == cnt - 1)
 				System.out.println(arr[i]);
 			else
 				System.out.print(arr[i]+" ");
 		}
		
	}
}
