package Chris.Chapter07.Method;

public class Hw0707 {
	public static boolean even(int n){
		
				
		if (n%2==0) {
			return true;
		}
		else
		return false;
		
		
	}
	public static void main(String[] args) {
		int n=100;
		for (int i=1;i<=n;i++) {
		if (even(i)==true &&i%9==0){
		
			System.out.println(i);
		}
		
	}
	}
}
