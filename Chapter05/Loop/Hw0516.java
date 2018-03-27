package Chris.Chapter05.Loop;
import java.util.Scanner;
public class Hw0516 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int input;
		int cnt=0;
		int password=1006;
		
		while(true) {
			System.out.print("請輸入密碼: ");
			input=scn.nextInt();
			cnt++;
			if (input==password){
				System.out.print("密碼輸入正確，歡迎使用本系統!!");
				break;
			}	
			if (cnt>=3) {
				System.out.println("密碼輸入超過三次!!");
				break;
			}
			}
		}

	}


