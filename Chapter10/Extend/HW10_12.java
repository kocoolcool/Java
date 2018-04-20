package Chris.Chapter10.Extend;

//hw10_11, 利用父類別變數存取子類別成員的練習(一)
class X // 父類別CShape
{
	
	public double area() {
		
		return 0.0;
	}
}
class X1 extends X{
   double  r;
public X1(double a) {
	r=a;
}
 
public double area() {
		return (r*r*3.14);
	}
}
class X2 extends X{
	double x;
	public X2(double y) {
		x=y;
	}
public double area() {
		
		return x*x;
	}
}

class X3 extends X{
	double base,height;
	X3(double a,double b) {
	 base=a;
	 height=b;
	}
public double area() {
	return  (base*height/2);
		
	}
}

public  class HW10_12 {

	public static void main(String[] args) {
		
		X[] b=new X[6];
		b[0]=new X1(2.0);		
	    b[1]=new X1(3.0);
		b[2]=new X2(2.0);
		b[3]=new X2(3.0);
		b[4]=new X3(2.0,2.0);
		b[5]=new X3(3.0,3.0);
		for(int i=0;i<b.length;i++)
		System.out.println("b["+i+"]"+b[i].area());
		 System.out.println("最大值面積是="+largest(b));
	
			
		
		
	
	}

		
		

	public static double largest(X[] a) {
	 double max= a[0].area();
	 for(int i=0;i<a.length;i++) {
		 if (max<a[i].area()) {
			 max=a[i].area();
		 }
	 }
	return max;

	}
}