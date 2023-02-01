public class solution {

	public static void mergeSort(int[] input) {
		// Write your code here
		if (input.length <= 1)
			return;
		int mid = input.length / 2;
		int a[] = new int[mid];
		int b[] = new int[input.length - mid];
		for (int i = 0; i < mid; i++) {
			a[i] = input[i];
		}
		int k = 0;
		for (int i = mid; i < input.length; i++) {
			b[k] = input[i];
			k++;
		}
		mergeSort(a);
		mergeSort(b);
		merge(input, a, b);
	}

	public static void merge(int dest[], int a[], int b[]) {
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				dest[k] = a[i];
				i++;
				k++;
			} else {
				dest[k] = b[j];
				j++;
				k++;
			}
		}
		while (i < a.length) {
			dest[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			dest[k] = b[j];
			j++;
			k++;
		}
	}
}
