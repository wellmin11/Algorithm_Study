import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int cnt = 0;
			for (int i = 0; i < 4; i++) {
				if(sc.nextInt() == 0)
					cnt++;
			}
			
			switch (cnt) {
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			default:
				System.out.println("E");
				break;
			}
		}
	}
}
