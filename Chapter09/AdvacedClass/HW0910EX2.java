package Chris.Chapter09.AdvacedClass;

class CRational1 {
	public int n;
	public int d;

	public void setN(int num) {
		n = num;
	}

	public void setD(int num) {
		d = num;
	}

	public void setND(int num, int den) {
		n = num;
		d = den;
	}

	public CRational1 add(CRational1 r) {
		CRational1 a1 = new CRational1();
		a1.d = this.d * r.d;
		a1.n = (this.n * r.d) + (this.d * r.n);
		System.out.println(a1.n + "/" + a1.d);
		return a1;
	}

	public CRational1 sub(CRational1 r) {
		CRational1 a1 = new CRational1();
		a1.d = this.d * r.d;
		a1.n = (this.n * r.d) - (this.d * r.n);
		System.out.println(a1.n + "/" + a1.d);
		return a1;
	}

	public CRational1 mul(CRational1 r) {
		CRational1 a1 = new CRational1();
		a1.d = this.d * r.d;
		a1.n = (this.n * r.n);
		System.out.println(a1.n + "/" + a1.d);
		return a1;
	}

	public CRational1 div(CRational1 r) {
		CRational1 a1 = new CRational1();
		a1.d = this.d * r.n;
		a1.n = (this.n * r.d);
		System.out.println(a1.n + "/" + a1.d);
		return a1;
	}

	public CRational1 compare(CRational1 r1, CRational1 r2) {
		if ((r1.n / r1.d) > (r2.n / r2.d)) {
			System.out.println(r1.n + "/" + r1.d);

			return r1;
		} else {
			System.out.println(r2.n + "/" + r2.d);
			return r2;
		}
	}

	public boolean larger(CRational1 r) {

//		int cd = this.d * r.d;
		int cn = (this.n * r.d) - (this.d * r.n);
		if (cn < 0)
			return false;
		else
			return true;
	}
}

public class HW0910EX2 {

	public static void main(String[] args) {

		CRational1 aaa = new CRational1();
		CRational1 bbb = new CRational1();
		CRational1 ccc = new CRational1();
		CRational1 ddd = new CRational1();
		// aaa.setN(2);
		// aaa.setD(5);
		// show(aaa);
		ccc.setND(9, 3);
		aaa.setND(20, 5);
		show(aaa);
		bbb.setND(3, 7);
		show(bbb);
		aaa.add(bbb);
		aaa.sub(bbb);
		aaa.mul(bbb);
		aaa.div(bbb);
		ddd=aaa.compare(aaa, bbb);
		System.out.print(ddd.larger(ccc));
	}

	public static void show(CRational1 a) {
		System.out.println(a.n + "/" + a.d);
		
	}

}
