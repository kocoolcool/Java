package Chris.Chapter13.Exception;
// HW13_12,
class NotTriangleExceptions extends Exception{
	public String toString() {
		return "不構成三角形";
		}
}
class EquilateralTriangleExceptions extends Exception{
	public String toString() {
		return "正是三角形";
		}
}
class NotEquilateralTriangleExceptions extends Exception{
	public String toString() {
		return "這不是正三角形";
		}
}
public class HW13_12 {
	static int d;
	static int e;
	static int f;
	static  void triangle(int a,int b,int c) throws NotEquilateralTriangleExceptions, EquilateralTriangleExceptions, NotTriangleExceptions {	
		d=a;e=b;f=c;
		 if ((a + b) < c || (a + c) < b || (b + c) < a) {
			 throw new NotTriangleExceptions();
		 }
		 else if (a == b && a == c && b == c) {
			 throw new EquilateralTriangleExceptions();
		 }
		 else 
			 throw new NotEquilateralTriangleExceptions();
	}
	public static void main(String args[])  {
		try {
		HW13_12.triangle(7, 8, 6);
		}
		catch(NotTriangleExceptions e) {
			System.out.println(e);
		} catch (NotEquilateralTriangleExceptions e) {
			System.out.println(e);
			
		} catch (EquilateralTriangleExceptions e) {
			System.out.println(e);
		}
		System.out.println("邊長d="+d);
		System.out.println("邊長e="+e);
		System.out.println("邊長f="+f);
	}	
}
