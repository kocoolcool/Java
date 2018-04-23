package Chris.Chapter13.Exception;

class Ctest {
	int num, den;
	Ctest(int a,int b){
		num=a;
		den=b;
	}
	public int test() throws ArithmeticException {
		
		int ans = num / den;
		return ans;
	}
}

public class HW11_8 {

	public static void main(String[] args) {
		try {
			Ctest ct = new Ctest(10,2);
			System.out.println(ct.test());
		}

		catch (ArithmeticException e) {
			System.out.println("Have Exception");
		} finally {
			System.out.println("end of main() method !!");
		}
	}

}