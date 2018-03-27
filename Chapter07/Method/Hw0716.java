package Chris.Chapter07.Method;

public class Hw0716 {
	private static int sum;//宣告的一種方法
	private static int count=0;


	public static double a(int arr[][]){
	
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				  sum += arr[i][j];
				count++;
				
			}
			
		}
		//System.out.print((double)(sum)/count);
		//System.out.println(count);
		return (double)sum/count;
	}
	
	
	
	public static void main(String[] args) {
		Hw0716 c =new Hw0716();
		int a[][]= {{2,4,6},{1,3,5},{8,9}};
		
		System.out.println(Hw0716.a(a));//也是一種方法
		//Hw0716.a(a);//第一種呼叫方法
		//c.a(a);//第二種呼叫方法
		//System.out.print((double)(sum)/count);
		//System.out.print(sum+""+count);//第三種呼叫方法	
		//System.out.print(count);
	}

}
