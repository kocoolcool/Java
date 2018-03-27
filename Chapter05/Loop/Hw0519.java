package Chris.Chapter05.Loop;
import java.util.Scanner;
public class Hw0519 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int	x= input.nextInt();
		//if (x<=5 && x>=1) {
		//	System.out.print("今天要上班");
		//}
		//else if (x>=6 && x<=7) {
		//	System.out.print("今天休息");
		//}
		//else {
		//System.out.print("輸入錯誤");	
		//}
		switch (x) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			System.out.print("上班");
			break;
			case 6:
			case 7:
			System.out.print("放假");
			break;
		default :
			System.out.print("Error");
		}
	}	

}
