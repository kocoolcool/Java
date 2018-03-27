package Chris.Chapter07.Method;

public class Hw0714 {
public static int a(int arr[][]) {
	int max=arr[0][0];
	for (int i=0;i<arr.length;i++) {
		for(int j = 0;j<arr[i].length;j++) {
			System.out.print (arr[i][j]+"\t");
			if(max<arr[i][j]) {
				max=arr[i][j];
			}
		}
	}
	
	
	return max  ;	
}
	public static void main(String[] args) {
		int a[][]= {{75,29,10},{38,45,16}};
		System.out.print("\n"+Hw0714.a(a));
	}

}
