package sorting.time_comparison;

import java.util.Random;

public class SortingTimeComparisonDemo {

	private static int[] randomArray;

	public static void main(String[] args) {
		randomArray = generateNumbers(75000, Integer.MAX_VALUE);

		Stopwatch bubble1 = new Stopwatch("Bubble s. #1");
		Stopwatch bubble2 = new Stopwatch("Bubble s. #2");
		Stopwatch bubble3 = new Stopwatch("Bubble s. #3");

		Stopwatch selection1 = new Stopwatch("Selection s. #1");
		Stopwatch selection2 = new Stopwatch("Selection s. #2");
		Stopwatch selection3 = new Stopwatch("Selection s. #3");

		Stopwatch insertion1 = new Stopwatch("Insertion s. #1");
		Stopwatch insertion2 = new Stopwatch("Insertion s. #2");
		Stopwatch insertion3 = new Stopwatch("Insertion s. #3");

		System.out.println("Please have petience...\n");
		//warm up
		bubble1.start();
		SortingAlgorithms.bubbleSort(randomArray);
		bubble1.stop();
		bubble1.printDuration();
		selection1.start();
		SortingAlgorithms.selectionSort(randomArray);
		selection1.stop();
		selection1.printDuration();
		insertion1.start();
		SortingAlgorithms.insertionSort(randomArray);
		insertion1.stop();
		insertion1.printDuration();
		System.out.println();
		//main double check
		bubble2.start();
		SortingAlgorithms.bubbleSort(randomArray);
		bubble2.stop();
		bubble2.printDuration();
		bubble3.start();
		SortingAlgorithms.bubbleSort(randomArray);// bubble #3 is faster than 1 & 2
		bubble3.stop();
		bubble3.printDuration();
		System.out.println();
		selection2.start();
		SortingAlgorithms.selectionSort(randomArray);
		selection2.stop();
		selection2.printDuration();
		selection3.start();
		SortingAlgorithms.selectionSort(randomArray);
		selection3.stop();
		selection3.printDuration();
		System.out.println();
		insertion2.start();
		SortingAlgorithms.insertionSort(randomArray);
		insertion2.stop();
		insertion2.printDuration();
		insertion3.start();
		SortingAlgorithms.insertionSort(randomArray);
		insertion3.stop();
		insertion3.printDuration();

		System.out.println("\nDone.");

		//test();
	}

	private static int[] generateNumbers(int howMany, int maxRange) {
		System.out.println("Generating random array, size: " + howMany + ", max. range: " + maxRange);
		int[] randomArray = new int[howMany];
		Random randomGenerator = new Random();
		for (int i = 0; i < howMany; i++) {
			randomArray[i] = randomGenerator.nextInt(maxRange) + 1;
		}
		System.out.println("Generation complete, passing array");
		return randomArray;
	}

	private static void test() {
		randomArray = generateNumbers(50, 100);
		int[] sorted;
		sorted = SortingAlgorithms.insertionSort(randomArray); //replace the alg.
		for (int i : sorted) {
			System.out.print(i + ", ");
		}
	}

}
