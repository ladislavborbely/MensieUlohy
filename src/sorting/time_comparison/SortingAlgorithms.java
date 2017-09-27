package sorting.time_comparison;

public class SortingAlgorithms {

	private SortingAlgorithms() {
		//private
	}

	public static int[] bubbleSort(int[] inputToSort) {
		int[] toSort = inputToSort.clone();
		int temp;
		for (int i = 0; i <= toSort.length - 1; i++) {
			for (int e = 0; e <= toSort.length - 2 - i; e++) {
				if (toSort[e] > toSort[e + 1]) {
					temp = toSort[e];
					toSort[e] = toSort[e + 1];
					toSort[e + 1] = temp;
				}
			}
		}
		return toSort;
	}

	public static int[] selectionSort(int[] inputToSort) {
		int[] toSort = inputToSort.clone();
		int temp;
		for (int i = 0; i < toSort.length - 1; i++) {
			for (int j = i + 1; j < toSort.length; j++) {
				if (toSort[i] > toSort[j]) {
					temp = toSort[i];
					toSort[i] = toSort[j];
					toSort[j] = temp;
				}
			}
		}
		return toSort;
	}

	public static int[] insertionSort(int[] inputToSort) {
		int[] toSort = inputToSort.clone();
		int temp, j;
		for (int i = 1; i < toSort.length; i++) {
			temp= toSort[i];
			j = i - 1;
			while (j >= 0 && toSort[j] > temp) {
				toSort[j + 1] = toSort[j];
				j--;
			}
			toSort[j + 1] = temp;
		}
		return toSort;
	}
}
