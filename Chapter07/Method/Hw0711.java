package Chris.Chapter07.Method;


public class Hw0711 {
	public static void count(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"\t");
		if(arr[i]%2==1){
		System.out.print(arr[i]+"\t");
		}
	}
	}	

	public static void main(String[] args) {
		int arr[]= {8,6,9,12,47,55,10};
		Hw0711.count(arr);
	}

}
