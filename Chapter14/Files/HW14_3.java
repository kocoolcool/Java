package Chris.Chapter14.Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW14_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入一個整數");
		String str	=buf.readLine();
		int	n=Integer.parseInt(str);
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum+=i;
	}
		System.out.println(sum);
	}

}
