package Chris.Chapter13.Exception;

public class HW13_3 {
	public static void main(String args[])
	 {
	try {
	 int num=12,den=0;
	 int ans=num/den;
	 System.out.println(ans);
	}
	 catch(ArithmeticException e)
	{
		 System.out.println("den=0");
	}
		finally { 
	 System.out.println("end of main() method !!");
		}
		}
}
