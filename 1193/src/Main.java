import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// �� ��
		int a = 1;
		int b = 2;
		
		// ���� �������� 
		// ex) 4�� : 10 5�� : 15
		int aa = 0;
		int bb = 1;
		
		while (true) {
			// ���� ���� ���� 
			aa = (a * (a + 1)) / 2;
			bb = (b * (b + 1)) / 2;
			
			// ���ԵǴ� ���� ã���� �� 
			if(aa < num && num <= bb) 
				break;
			
			a++;b++;
		}
		
		int i = num - aa;
		int result = b + 1 - i;
		System.out.println(b % 2 != 0 ? result + "/" + i : i + "/" + result);
	}
}
