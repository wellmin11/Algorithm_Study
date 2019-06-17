import java.util.Scanner;
/**
 * Merge sort ±¸Çö 
 * @author user
 *
 */
public class Main {
	private static int sorted[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sorted = new int[T];
		int arr[] = new int[T];

		for (int i = 0; i < T; i++)
			arr[i] = sc.nextInt();

		mergeSort(arr, 0, T - 1);

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		sc.close();
	}

	private static void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;

			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}

	}

	public static void merge(int[] arr, int start, int mid, int end) {
		int i, j, k;
		i = start;
		j = mid + 1;
		k = start;

		while (i <= mid && j <= end) {
			if (arr[i] <= arr[j])
				sorted[k++] = arr[i++];
			else
				sorted[k++] = arr[j++];
		}

		if (i > mid) {
			for (int l = j; l <= end; l++)
				sorted[k++] = arr[l];
		}
		else {
			for (int l = i; l <= mid; l++)
				sorted[k++] = arr[l];
		}

		for (int k2 = start; k2 <= end; k2++) {
			arr[k2] = sorted[k2];
		}
	}
}
