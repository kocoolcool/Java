package Chris.Chapter07.Method;

public class Hw0715 {
	public static int a(int arr[]) {
		int max=arr[0],min=arr[0];
		for (int i=0;i<arr.length;i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
			if (min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("max="+max);
		System.out.println("max="+min);	
		
	return max*min;
	}
		
	
	public static void main(String[] args) {
		int a[]= {75,29,10,38,45,16};
		//Hw0715.a(a);
		System.out.println(a(a));
	}

}
