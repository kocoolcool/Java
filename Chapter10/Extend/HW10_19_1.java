package Chris.Chapter10.Extend;

// hw10_19,
class CRectangle6 {
	protected int length;
	protected int width;

	public CRectangle6(int l, int w) {
		length = l;
		width = w;
	}

	public String toString() {
		String str = "length=" + length + ", width=" + width;
		str += ", area=" + length * width;
		return str;
	}
}

public class HW10_19_1 {
	public static void main(String args[]) {
		CRectangle6 rect = new CRectangle6(2, 6);
		System.out.println(rect);
		System.out.println(rect.toString());
		
	}
}