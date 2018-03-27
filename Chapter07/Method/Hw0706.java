package Chris.Chapter07.Method;

public class Hw0706 {
	public static boolean even(int n) {
		if (n%2==0) {
			return true;
		}
		else
		return false;
	}
	public static void main(String[] args) {
		int n=0;
		if (even(n)==true){
		System.out.print(n+"是偶數");
		}
		else 
		System.out.print(n+"是奇數");	
	}

}
