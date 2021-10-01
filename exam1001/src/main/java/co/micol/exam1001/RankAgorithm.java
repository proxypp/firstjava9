package co.micol.exam1001;

public class RankAgorithm {
	private int[] grade = { 80, 90, 100, 50, 70, 60, 40 };

	private int[] rank;

	private void rank() {
		rank = new int[grade.length];
		for (int i = 0; i < rank.length; i++) { // rank 배열 초기화
			rank[i] = 1;
		}
//		for(int i : rank) {// 출력할때 쓴다. 초기화 할때는 쓰지않는다. enhance for
//			i=1;
//		}
		
		for (int i = 0; i < grade.length - 1; i++) {
			for (int j = i + 1; j < grade.length; j++) {
				if (grade[i] > grade[j]) {
					rank[j]++;
				} else if (grade[i] < grade[j]) {
					rank[i]++;
				}
			}
		}
	}

	public String toString() {
		rank();
		for (int g : grade) { // 보다 나은 for문 forEach 구문 값을 읽을때 사용한다.// 출력 할때만 쓴다. 입력 할때는 쓰지않는다.
			System.out.print(g + " ");
		}
		System.out.println();
		for (int r : rank) {
			System.out.print(r + " ");
		}
		return null;
	}
}
