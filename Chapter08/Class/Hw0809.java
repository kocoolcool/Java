package Chris.Chapter08.Class;
class CCalculator{
	int a;
	int b;
	int c;
	 void set_value(int x,int y,int z) {
		a= x;
		b=y;
		c=z;
	}
	 void show() {
		 System.out.println(a+","+b+","+c);
	 }
	 void add() {
		 System.out.println(a+b+c);
	 }
	 void sub() {
		 System.out.println(a-b-c);
	 }
	 void mul() {
		 System.out.println(a*b*c);
	 }
	 void avg() {
		 System.out.println((a+b+c)/3.0);
	 }
}
public class Hw0809 {

	public static void main(String[] args) {
		CCalculator obj=new CCalculator();
		obj.set_value(25, 3, 7);
		obj.show();
		obj.add();
		obj.sub();
		obj.mul();
		obj.avg();

	}

}
