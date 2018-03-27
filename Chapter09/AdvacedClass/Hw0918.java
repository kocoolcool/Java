package Chris.Chapter09.AdvacedClass;

public class Hw0918 {

	public static void main(String[] args) {
			(
			new CCircle(2.0) {
				 void show() {
				
				System.out.print(pi*radius*radius);
				}
			}
				).show();
	}

	static class CCircle {
		double pi = 3.14;
		public double radius;

		CCircle(double r) {
			radius = r;
		}
	}
}
