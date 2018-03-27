package Chris.Chapter08.Class;

class CSphere {
	public int x;
	public int y;
	private int z;
	private int radius;

	void setLocation(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
	}

	void setRadius(int r) {
		radius = r = 1;
	}

	double surfaceArea() {
		double surface = 4 * radius * radius * 3.14;
		return surface;
	}

	double volume() {
		double a = ((double)(3.0/4)*3.14 * radius * radius * radius);
		return a;
	}
	void showCenter() {
		System.out.print("x:"+x +"y:"+ y +"z:"+ z);
		
	}
}
public class Hw0816 {

	public static void main(String[] args) {
		CSphere cir=new CSphere();
		cir.setLocation(3, 4, 5);
		cir.setRadius(1);
		System.out.println(cir.surfaceArea());
		System.out.println(cir.volume());
		cir.showCenter();
		
	}

}
