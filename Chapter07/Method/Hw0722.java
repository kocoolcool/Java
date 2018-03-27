package Chris.Chapter07.Method;

public class Hw0722 {
	public static double f(double x,int n) {
		double c=0;
		if (n==0)
			return x;
		if (n==1)
			return x;
		c=x*f(x,n-1);
		return c;
	}
	public static void main(String[] args) {
		System.out.println(f(3,8));
		System.out.println(f(7,4));
		System.out.println(f(2,0));
	}

}
