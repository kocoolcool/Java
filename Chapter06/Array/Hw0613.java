package Chris.Chapter06.Array;

public class Hw0613 {

	public static void main(String[] args) {
		int A[][][] = { { { 18, 172, 127 }, { 89, 133, 136 }, { 175, 8, 43 } },
				{ { 234, 224, 113 }, { 128, 151, 40 }, { 34, 48, 75 } },
				{ { 141, 28, 192 }, { 127, 40, 234 }, { 131, 228, 98 } } };
		int B[][][] = new int[3][3][3];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				A[i][j][0] += 30;
				if(A[i][j][0]>255)
					A[i][j][0]=255;
				
			}
		}
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				for (int k = 0; k < A[i][j].length; k++) {
					System.out.print(A[i][j][k]+"\t");
				}
				System.out.println();
			}

		}
	System.out.println();
	for (int i = 0; i < A.length; i++) {
		for (int j = 0; j < A[i].length; j++) {
			A[i][j][1] -= 30;
			if(A[i][j][1]<0)
				A[i][j][1]=0;
			
		}
	}
	for (int i = 0; i < A.length; i++) {
		for (int j = 0; j < A[i].length; j++) {
			for (int k = 0; k < A[i][j].length; k++) {
				System.out.print(A[i][j][k]+"\t");
			}
			System.out.println();
		}

	}
	}
}
