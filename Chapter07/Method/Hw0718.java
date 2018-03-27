package Chris.Chapter07.Method;

public class Hw0718 {
	//private static int sum;
	//private static int count=0;
	public static double avg(int arr[]) {
	  	int sum=0;
	  	int count=0; 
		for (int i=0;i<arr.length;i++) {
		   	//for(int j=0;j<arr[i].length;j++){
			sum +=arr[i];
			count++;
			//}
	  	 }		
	 return (double)sum/count; 
 }
	public static void main(String[] args) {
		int a[]= {75,29,10,38,45,17};
		System.out.println(Hw0718.avg(a));
	}

}
