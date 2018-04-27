package Chris.Chapter14.Files;

import java.util.Scanner;

public class HW14_3_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入一個整數");
		String str=scn.nextLine();
		
		int	n=Integer.parseInt(str);
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum+=i;
	}
		System.out.println(sum);
	}

}
