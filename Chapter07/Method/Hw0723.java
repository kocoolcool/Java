package Chris.Chapter07.Method;

public class Hw0723 {
	public static int rsum(int n) {
		if (n==1) {
			return 0;
		}
		return (rsum(n-1)+n*(n-1));
	}
	public static void main(String[] args) {
		System.out.println(rsum(5));
		
	}

}
