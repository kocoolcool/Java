package Chris.Chapter07.Method;

public class Hw0705 {
public static double fahreheit(double c) {
	double x=(c*9/5)+32;
	return x;
	
}
	public static void main(String[] args) {
		int c=20;
		System.out.print("攝氏溫度:"+c+"\t"+"華氏溫度:"+fahreheit(20));
	}

}
