import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        String num = sc.nextLine();
        int sum=0;
         
        for(int j=0; j<num.length(); j++) {
        char value = num.charAt(j);
         
        if('A'<= value && value <='C') {
            sum = sum + 3;
        }else if('D'<= value && value <='F') {
            sum = sum + 4;
        }else if('G'<= value && value <='I') {
            sum = sum + 5;
        }else if('J'<= value && value <='L') {
            sum = sum + 6;
        }else if('M'<= value && value <='O') {
            sum = sum + 7;
        }else if('P'<= value && value <='S') {
            sum = sum + 8;
        }else if('T'<= value && value <='V') {
            sum = sum + 9;
        }else if('W'<= value && value <='Z'){
            sum = sum + 10;
        }
        }
            System.out.println(sum);
	}
}
