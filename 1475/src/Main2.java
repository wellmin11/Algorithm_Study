import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        String str = br.readLine();
 
        int size = str.length();
        int[] arr = new int[10];
        int temp = 0;
        int max = 0;
 
        //counting �迭�� ����Ͽ���.
        for (int i = 0; i < size; i++) {
            temp = str.charAt(i) - '0';
            arr[temp]++;
 
        }
        //�ٸ� ���ڴ� ��������� 6,9�϶� �ٲ㼭 ��밡���ϴ�.
        //6,9�� ���� ���ڷ� ����.
        int k = (arr[6] + arr[9]);
        //6,9�� ���� ¦���̸� ������ ������ �ȴ�.
        if (k % 2 == 0) {
            arr[6] = k / 2;
            arr[9] = k / 2;
        }
        //6,9�� ���� Ȧ���̸� ������ ������ 1�� �� ����ؾߵǱ� ������ 1�� �����ش�.
        else {
            arr[6] = k / 2 + 1;
            arr[9] = k / 2 + 1;
        }
        //�ݺ��ؼ� �ִ밪�� ã�´�.
        for (int i : arr) {
            max = Math.max(max, i);
        }
        System.out.println(max);
    }
 
}
