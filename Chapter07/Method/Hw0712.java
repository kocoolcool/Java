package Chris.Chapter07.Method;

public class Hw0712 {
	public static int a(int arr[]) {
		int min=arr[0];
		for (int i=0;i<arr.length;i++) {
		if (min>arr[i]) {
			min=arr[i];
		}
		}
		return min;
		
	}
	public static void main(String[] args) {
		int a[]= {75,29,38,45,16};
		System.out.print(Hw0712.a(a));
	}

}
