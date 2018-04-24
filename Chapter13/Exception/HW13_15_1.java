package Chris.Chapter13.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ArgumentOutOfBound1 extends Exception{
	
}
public class HW13_15_1 {
	static double ans;
static	void	mysqrt(int n)  {
	try {
		if(n<0) {
			throw new ArgumentOutOfBound1();
		}
		else 
			ans = (double)Math.sqrt(n);
		System.out.println("ans="+ans);
		}
	catch(ArgumentOutOfBound1 e) {
		System.out.println("n<0");
	}
}
	public static void main(String[] args) throws IOException {
		BufferedReader buf;
		String str;
		int num;
		
		 buf=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("請輸入整數");
		 str= buf.readLine();
		 num=Integer.parseInt(str);
		 HW13_15_1.mysqrt(num);
	}
	}
