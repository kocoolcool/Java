package Chris.Chapter10.Extend;

//hw10_11, 利用父類別變數存取子類別成員的練習(一)
class CShape // 父類別CShape
{
	
	public double area() {
		
		return 0.0;
	}
}
class CCircle extends CShape{

public double area(int r) {
		double x=r*r*3.14;
		return x;
	}
}
class CSquare extends CShape{
public double area(int x) {
		double b=x*x;
		return b;
	}
}

class CTriangle1 extends CShape{
public double area(int a,int b) {
		double c=a*b/2;
		return c;
	}
}

public  class HW10_11 {

	public static void main(String[] args) {
		CCircle cc1=new CCircle();
		System.out.println("cc1.area(1)"+cc1.area(1));
		System.out.println("cc1.area(2)"+cc1.area(2));
		CSquare cs1=new CSquare();
		System.out.println("cs1.area(1)"+cs1.area(1));
		System.out.println("cs1.area(2)"+cs1.area(2));
		CTriangle1 ct1=new CTriangle1();
		System.out.println("ct1.area(2, 2)"+ct1.area(2, 2));
		System.out.println("ct1.area(3, 3)"+ct1.area(3, 3));
		double[] b=new double[6];
		b[0]=cc1.area(1);
		b[1]=cc1.area(2);
		b[2]=cs1.area(1);
		b[3]=cs1.area(2);
		b[4]=ct1.area(2, 2);
		b[5]=ct1.area(3, 3);		
		 System.out.println("最大值面積是="+largest(b));
	
			
		
		
	
	}
	public static double largest(double[] a) {
		double max=a[0];
		for(int i=0;i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		}
			
		}
		
		
		return max;
	}
//	public static double largest(double a[])
//	 {
//	 double max=a[0];
//	 for(int i=0;i<a.length;i++)
//	 if(max<a[i])
//	 max=a[i];
//	 return max;
//	 }
	 }

