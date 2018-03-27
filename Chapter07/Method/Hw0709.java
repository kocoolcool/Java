package Chris.Chapter07.Method;

public class Hw0709 {
public static int abs(int x) {
	if (x<0) {
		return -x;	
	}
	else
	return x;
}
	public static void main(String[] args) {
		System.out.println(abs(-5));
		System.out.println(abs(2));
		System.out.println(abs(0));
	}

}
