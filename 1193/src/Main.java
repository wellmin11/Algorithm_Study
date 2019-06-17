import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 군 값
		int a = 1;
		int b = 2;
		
		// 군의 마지막값 
		// ex) 4군 : 10 5군 : 15
		int aa = 0;
		int bb = 1;
		
		while (true) {
			// 등차 수열 공식 
			aa = (a * (a + 1)) / 2;
			bb = (b * (b + 1)) / 2;
			
			// 포함되는 군을 찾았을 때 
			if(aa < num && num <= bb) 
				break;
			
			a++;b++;
		}
		
		int i = num - aa;
		int result = b + 1 - i;
		System.out.println(b % 2 != 0 ? result + "/" + i : i + "/" + result);
	}
}
