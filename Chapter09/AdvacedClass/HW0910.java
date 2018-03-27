package Chris.Chapter09.AdvacedClass;
class CRational{
	public int n;
	public int d;
	public void setN(int num) {
		n=num;
	}
	public void setD(int num) {
		d=num;
	}
	
	public void setND(int num,int den) {
		n=num;
		d=den;
	}
	public CRational add(CRational r) {
		CRational a1=new CRational();
		a1.d=this.d*r.d;
		a1.n=(this.n*r.d)+(this.d*r.n);
		
		return a1;
	}
	public CRational sub(CRational r) {
		CRational a1=new CRational();
		a1.d=this.d*r.d;
		a1.n=(this.n*r.d)-(this.d*r.n);
		
		return a1;
	}
	
}	
public  class HW0910 {

	
	public static void main(String[] args) {
		
		CRational aaa=new CRational();
		CRational bbb=new CRational();
//		aaa.setN(2);
//		aaa.setD(5);
//		show(aaa);
		aaa.setND(6, 3);
		show(aaa);
		bbb.setND(2, 4);
		show(bbb);
		

	}
	public static void show(CRational a) {
		System.out.println(a.n+"/"+a.d);
	
	}

}
