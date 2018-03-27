package Chris.Chapter07.Method;

public class Hw0713 {
	private static int index;
	public static int a(int arr[]) {
		
		int min=arr[0];
		for (int i=0;i<arr.length;i++) {
		if (min>arr[i]) {
			min=arr[i];
			index = i;
			//System.out.println(index);
			}	
		
			//return index ;
		}
		//System.out.println(index);
		
		return min;
		}
		
	
	public static void main(String[] args) {
		int a[]= {75,29,38,45,16};
		System.out.println("最小值:"+Hw0713.a(a));
		System.out.println("a["+Hw0713.index+"]" );
	}
}