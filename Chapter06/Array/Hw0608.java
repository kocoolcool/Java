package Chris.Chapter06.Array;

import java.text.DecimalFormat;

public class Hw0608 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##.00");
		double avg = 0;
		double max = 0;
		int w1 = 0,t1=0;
		int w2 = 0,t2=0;
		double t[] = new double[4];
		double s[] = new double[3];

		System.out.print("\t星期一\t星期二\t星期三\t星期四\n");
		double a[][] = { { 18.2, 17.3, 15.0, 13.4 }, { 23.8, 25.1, 20.6, 17.8 }, { 20.6, 21.5, 18.4, 15.7 } };
		double min = a[0][0];
		for (int i = 0; i < a.length; i++) {
			System.out.print("時段" + (i + 1) + "\t");
			for (int j = 0; j < a[i].length; j++) {
				avg += a[i][j];
				System.out.print(a[i][j] + "\t");
				if (j == a[i].length - 1) {
					System.out.println();
				}
			}
		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				t[i] += a[j][i];

			}
			System.out.println("星期" + (i + 1) + "的平均溫度:" + df.format(t[i] / 3));
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				s[i] += a[i][j];
				if (max < a[i][j]) {
					max = a[i][j];
					t1=i;
					w1=j;
				}	
				if (min > a[i][j]) {
					min = a[i][j];
					t2=i;
					w2=j;
				}	
			}
			System.out.println("時段" + (i + 1) + "的平均溫度:" + df.format(s[i] / 4));
		}
		System.out.println("星期"+(w1+1)+":"+"時段"+(t1+1)+":"+"最高溫度:"+max);
		System.out.println("星期"+(w2+1)+":"+"時段"+(t2+1)+":"+"最低溫度:"+min);
		
		

	}
}