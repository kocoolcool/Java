package Chris.Chapter07.Method;

public class Hw0704 {
	public static int addto(int n) {
		int sum=0;
		for (int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int n=10;
		System.out.println("1+2+...+"+n+"="+(addto(10)));

	}

}
