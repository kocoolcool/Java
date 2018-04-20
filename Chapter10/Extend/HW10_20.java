package Chris.Chapter10.Extend;

// hw10_19,
class CRectangle7 {
	protected int length;
	protected int width;

	public CRectangle7(int l, int w) {
		length = l;
		width = w;
	}

	public String toString() {
		String str = "length=" + length + ", width=" + width;
		str += ", area=" + length * width;
		return str;
	}
	public String toString(int a,int b) {
		if(a>=b)
		return super.toString();
		else
		return "Argument Error";
		}
}

public class HW10_20 {
	public static void main(String args[])
 {
		CRectangle7 rect=new CRectangle7(2,6);
		System.out.println(rect);
		 System.out.println(rect.toString());
		 System.out.println(rect.toString(8,4));
		 System.out.println(rect.toString(3,5));
 }
}