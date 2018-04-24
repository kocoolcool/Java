package Chris.Chapter13.Exception;

import java.util.*;

class IntegerTooSmall extends Exception {
}

class IntegerTooLarge extends Exception {
}


public class HW13_14 {

	public static void main(String[] args) {
			try {
			int num;
			Scanner scn=new Scanner(System.in);
			System.out.println("請輸入一個數字");
			num=scn.nextInt();
			
			if(num<10)
				throw new IntegerTooSmall();
			else if(num>70) 
				throw new IntegerTooLarge();
			else 
				System.out.println(num);
			}
			catch(IntegerTooSmall e) {
				System.out.println("您輸入的整數值太小");
			}
			catch(IntegerTooLarge e) {
				System.out.println("您輸入的整數值太大");
			}
//			catch(InputMismatchException e) {
//				System.out.println("您輸入的不是整數");
//			}
	}
}		
	
			
