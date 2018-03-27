package Chris.Chapter07.Method;

public class Hw0717 {

	public static void a(int arr[][]){
	for (int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=arr[i][j]*arr[i][j];
			System.out.print(arr[i][j]+"    ");
			
		}
	}	
	}	

	public static void main(String[] args) {
	int a[][]= {{1,4,8},{2,9,5},{6,3}};
	Hw0717.a(a);
//	Hw0717.a({{1,4,8},{2,9,5},{6,3}});
	//for (int i=0;i<a.length;i++) {
		//for(int j=0;j<a[i].length;j++) {
		//System.out.print(a[i][j]+"    ");
	}
	

	}

