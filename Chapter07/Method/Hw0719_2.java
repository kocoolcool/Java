package Chris.Chapter07.Method;

public class Hw0719_2 {
   public static long f(long n) {
	   //if (n==1)
		   //return 1;
	   if (n==0){
		  return 0 ;
	   }else if (n-1==0) {
		  return 1;  
	   }else
	      return f(n-1)+f(n-2);
   }
	public static void main(String[] args) {
		for (int i=1;i<=50;i++) {
    System.out.println(Hw0719_2.f(i));
	}
	}
}
