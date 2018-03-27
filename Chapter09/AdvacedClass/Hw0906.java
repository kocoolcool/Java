package Chris.Chapter09.AdvacedClass;

public class Hw0906 {
	 

	public void add2n(int n) {
		int i = 0, sum = 0;
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Hw0906 a=new Hw0906();
		a.add2n(5);
		a.add2n(10);

	}

}
