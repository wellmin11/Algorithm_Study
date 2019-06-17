import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] num = sc.next().toCharArray();
		boolean arr[] = new boolean[10];
		int set = 0;
		
		for (int i = 0; i < num.length; i++) {
			int n = num[i] - '0';
			if(n == 6 && arr[n] && !arr[9])
				arr[9] = true;
			
			if(n == 9 && arr[n] && !arr[6])
				arr[6] = true;
			
			if(!arr[n]) {
				arr[n] = true;
				if(i == num.length - 1 && set == 0)
					set++;
			}
			else {
				arr = new boolean[10];
				set++;
			}
		}
		System.out.println(set);
	}
}
