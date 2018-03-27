package Chris.Chapter06.Array;

public class Hw0614 {

	public static void main(String[] args) {
		int sum=0;
		int A[][][]= {{{82,13,21},{49,12,6}},
					 {{4,18,30},{50,24,62}},
					 {{7,9,14},{20,43,19}},
				     {{20,68,33},{15,17,38}}};
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++) {
				for(int k=0;k<A[i][j].length;k++) {
				System.out.print(A[i][j][k]+"\t");
					sum+=A[i][j][k];	
				}
				System.out.println();
			}
		}
System.out.println("總和:"+sum);
	}

}
