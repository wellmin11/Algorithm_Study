import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int two = 0, five = 0;
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result = i;
			while(result%2 == 0 || result%5 == 0) {
				if(result%2 == 0) {
					result /= 2;
					two++;
				}
				
				if(result%5 == 0 ) {
					result /= 5;
					five++;
				}
			}
		}
		
		System.out.println(two < five ? two : five);
	}
}
