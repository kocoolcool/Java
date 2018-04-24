package Chris.Chapter13.Exception;

// HW13_11,
class CCircleException extends Exception {
	public String toString() {
		return "CCircleException例外被拋出了";
	}
}

class CCircle9 {
	private double radius;

	public void setRadius(double r) throws CCircleException {
		if (r < 0) {
			throw new CCircleException();
		} else
			radius = r;
	}

	public void show() {
		System.out.println("area=" + 3.14 * radius * radius);
	}
}

public class HW13_11 {
	public static void main(String args[]) {
		CCircle9 cir = new CCircle9();
		try {
			cir.setRadius(-2.0);
		} catch (CCircleException e) {
			System.out.println(e);
		}
		cir.show();
	}
}