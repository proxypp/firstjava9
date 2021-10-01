package co.micol.exam1001;

/**
 * Hello world!
 *
 */
public class App {
	private static int[] a = { 7, 3, 6, 1, 4, 2, 5, 8, 9, 10 };

	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		selectionsort(); // Sort
//		toPrint();
//		System.out.println();
//		System.out.println("=================");
//
//		newSelectionSort();
//		toPrint();
		
		RankAgorithm rankAgorithm = new RankAgorithm();
		rankAgorithm.toString();
		
	}
	private static String toPrint() {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		return null;
	}
	

	private static void selectionsort() {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) { // Desc Sort
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
	}
	
	

	private static void newSelectionSort() {
		int min; // 인덱스의 위치값을 기억할 변수
		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
				if (i != min) {
					int temp = a[i];
					a[i] = a[min];
					a[min] = temp;
				}
			}
		}
	}
}
