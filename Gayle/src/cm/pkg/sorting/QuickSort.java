package cm.pkg.sorting;

public class QuickSort {

	public void quicksort(int[] array) {
		quicksort(0, array.length - 1, array);
		for (int b : array) {
			System.out.print(b +" , ");
		}
	}

	private void quicksort(int left, int right, int[] array) {
		if (left >= right) {
			return;
		}
		int pivot = array[(left + right) / 2];
		int index = partition(array, left, right, pivot);
		quicksort(left, index - 1, array);
		quicksort(index, right, array);
	}

	private int partition(int[] array, int left, int right, int pivot) {
		while (left <= right) {
			while (array[left] < pivot) {
				left++;
			}
			while (array[right] > pivot) {
				right--;
			}
			if (left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	private void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

	public static void main(String[] args) {
		int[] a = { 2, 4, 1, 5, 10, 56, 223, 31, 27, 9 };
		QuickSort q = new QuickSort();
		q.quicksort(a);
		

	}
}
