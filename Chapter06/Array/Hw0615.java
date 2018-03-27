package Chris.Chapter06.Array;

public class Hw0615 {

	public static void main(String[] args) {
		int A[][][] = { { { 15, 50, 65 }, { 38, 94, 25 }, { 79, 44, 19 }, { 89, 54, 73 } },
				{ { 14, 90, 46 }, { 43, 23, 67 }, { 32, 56, 78 }, { 94, 78, 40 } } };
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				for (int k = 0; k < A[i][j].length; k++) {
					System.out.print(A[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				for (int k = 0; k < A[i][j].length; k++) {
					if (A[i][j][k] > 50) {
						A[i][j][k] = 99;
					}
					System.out.print(A[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}