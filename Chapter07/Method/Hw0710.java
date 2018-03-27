package Chris.Chapter07.Method;

public class Hw0710 {
public static int min(int a,int b) {
	int min;
	min=(a<=b?a:b);
	return min;
}
	public static void main(String[] args) {
	System.out.println(min(5,8));
	System.out.println(min(9,2));
	System.out.println(min(-9,2));
	}

}
