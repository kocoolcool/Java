package Chris.Chapter08.Class;
class CCircle{
	double pi=3.14;
	double area(int r) {
		return (r*r*pi);
	}
	double area(double r) {
		return (r*r*pi);
	}
	float area(float r) {
		return (float) ((r*r*pi));
	}
}
public class Hw0813 {

	public static void main(String[] args) {
		CCircle a=new CCircle();
		System.out.println(a.area(2));
		System.out.println(a.area(2.2));
		System.out.println(a.area(2.2f));

	}

}
