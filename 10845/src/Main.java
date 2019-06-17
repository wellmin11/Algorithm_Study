import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static String[] arr;
	private static int popPoint = 0;
	private static int pushPoint = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		arr = new String[1000];
		for (int i = 0; i < T; i++) {
			String input = br.readLine();
			
			if(input.contains("push")) {
				String[] push = input.split(" ");
				push(push[1]);
			}else if(input.equals("pop")) {
				pop(false);
			}else if(input.equals("front")) {
				pop(true);
			}else if(input.equals("back")) {
				back();
			}else if(input.equals("size")) {
				System.out.println(pushPoint);
			}else if(input.equals("empty")) {
				empty();
			}
		}
		
	}

	private static void push(String num) {
		if(pushPoint == 0)
			popPoint = 0;
		arr[pushPoint++] = num;
	}

	private static void empty() {
		if(pushPoint == 0)
			System.out.println(1);
		else
			System.out.println(0);
	}

	private static void back() {
		if(pushPoint == 0)
			System.out.println("-1");
		else {
			System.out.println(arr[pushPoint - 1]);
		}
	}

	private static void pop(boolean front) {
		if(pushPoint == 0)
			System.out.println("-1");
		else {
			if(popPoint == arr.length) 
				popPoint = 0;
			
			if(!front) {
				System.out.println(arr[popPoint++]);
				pushPoint--;
			}else {
				System.out.println(arr[popPoint]);
			}
		}
		
	}
}
