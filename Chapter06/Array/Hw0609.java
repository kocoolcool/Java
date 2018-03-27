package Chris.Chapter06.Array;

public class Hw0609 {

	public static void main(String[] args) {
		int sales=0;
		int product=0;
		int salemax1=0;
		int salemax2=0;

		int amount[][]= {{33,32,56,45,33},{77,33,68,45,23},{43,55,43,67,65}};
		int price[]= {12,16,10,14,15};
		int sum[]=new int[5];
		int sum2[]=new int[5];
		
		for(int i=0;i<3;i++) {
			System.out.print("銷售員"+(i+1)+"\t");
			for(int j=0;j<5;j++) {
			System.out.print(amount[i][j]*price[j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
			sum[i]+=amount[i][j]*price[j];
			if(salemax1<sum[i]) {
				salemax1=sum[i];
				sales=i;
			}
			}
			System.out.println("銷售員"+(i+1)+"  銷售總金額:"+sum[i]);
			}
		System.out.println("業績最多銷售員"+(sales+1)+"\n");
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
			sum2[i]+=amount[j][i]*price[i];
			if(salemax2<sum2[i]) {
				salemax2=sum2[i];
				product=i;

			}
			}
			System.out.println("產品"+(i+1)+"  銷售總金額:"+sum2[i]);
			}
		System.out.println("銷售總金額最多產品"+(product+1)+"\n");
	}
}