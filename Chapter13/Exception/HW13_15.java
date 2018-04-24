package Chris.Chapter13.Exception;
class ArgumentOutOfBound extends Exception{
	
}
public class HW13_15 {
	static double ans;
	static void mySqrt(int n) throws ArgumentOutOfBound {
		if(n<0)
				throw new ArgumentOutOfBound();
		else
		ans=	Math.sqrt(n);
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		try {
		HW13_15.mySqrt(4);
		}
		catch(ArgumentOutOfBound e) {
			System.out.println("n<0");
		}
		}

}
