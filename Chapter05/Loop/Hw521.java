package Chris.Chapter05.Loop;

import java.util.*;

public class Hw521 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int input = x.nextInt();
		switch (input) {
		case 1:
		case 2:
			System.out.print("寒假");
			break;
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.print("下學期");
			break;
		case 7:
		case 8:
			System.out.print("暑假");
			break;
		case 9:
		case 10:
		case 11:
		case 12:	
			System.out.print("上學期");
			break;		
		
		default :
			System.out.print("月份不存在");
		}	
	}

}
