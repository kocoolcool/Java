package Chris.Chapter06.Array;

public class Hw0611 {

	public static void main(String[] args) {
		
		int A[][]= {{1,2,3,},{4,5,6}};
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++){
				System.out.print(A[i][j]+"\t");
				A[i][j]*=A[i][j];

		}
		}
		System.out.println();
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++){
			System.out.print(A[i][j]+"\t");
			}
		}
	}
}