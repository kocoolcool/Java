package Chris.Chapter11.Abstract;
//HW11_14,

 interface iVolume
 {
 public void showData(); // 顯示球體的資料
 public double vol(); // 計算球體積
 }
 abstract class CSphere implements iVolume
 {
 final double PI=3.14;
 protected int x;
 protected int y;
 }
 class CCircle6 extends CSphere
 {int r;
	 CCircle6(int a,int b,int c){
		 x=a;
		 y=b;
		r=c;
	 }
	@Override
	public void showData() {
		System.out.println("球心:("+x+","+y+")");
		System.out.println("半徑:"+r);
		System.out.println("球體積:"+ vol());
	}

	@Override
	public double vol() {
		
		return (4.0/3*PI*r*r*r);
	}


}

 public class HW11_14
 {
 public static void main(String args[])
 {
 CCircle6 cir=new CCircle6(8,6,2);
 cir.showData();
 }
 }