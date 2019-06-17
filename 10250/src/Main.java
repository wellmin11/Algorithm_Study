import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int count = 1;
			boolean isOver = false;
			
			for (int j = 0; j < W; j++) {
				for (int j2 = 0; j2 < H; j2++) {
					if(count == N) {
						W = ++j;
						H = ++j2;
						isOver = true;
						break;
					}
					count++;
				}
				if(isOver)
					break;
			}
			
			System.out.println( W < 10 ? String.valueOf(H)+"0"+String.valueOf(W) : String.valueOf(H)+String.valueOf(W));
		}
	}
}
