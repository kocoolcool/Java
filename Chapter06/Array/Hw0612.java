package Chris.Chapter06.Array;

public class Hw0612 {

	public static void main(String[] args) {
		int A[][][] = { { { 15, 85, 36 }, { 30, 14, 37 }, { 47, 23, 96 }, { 19, 39, 51 } },
				{ { 22, 16, 51 }, { 97, 30, 12 }, { 68, 77, 26 }, { 57, 32, 76 } } };
		int min = A[0][0][0];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				for (int k = 0; k < A[i][j].length; k++) {
					if (min > A[i][j][k])
						min = A[i][j][k];
				}
			}
		}
		System.out.println("min:"+min);

	}

}
