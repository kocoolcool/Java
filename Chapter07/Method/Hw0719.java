package Chris.Chapter07.Method;

public class Hw0719 {
	public static long f(int n) {
		
	long a1=1;
	long a2=1;
	long f=1;
	if (n==0) {
		return 0;
	}
		
	for(int i=3;i<=n;i++) {
		f=a1+a2;
		a2=a1;
		a1=f;
	}
	return (long)(f);
	}
	public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
		System.out.println(Hw0719.f(i));
		
	}

	}
}