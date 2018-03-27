package Chris.Chapter09.AdvacedClass;
class CCir{
	private static double pi=3.14;
	 public  double radius;
	
	public CCir(double r) {
		radius=r;
	}
	
}
public class Hw0909 {
	public   CCir compare(CCir cira,CCir cirb) {
		if(cira.radius>cirb.radius)
			return cira;
		else
			return cirb;
	}
	public static void main(String[] args) {
		CCir cir1=new CCir(1.0);
		CCir cir2=new CCir(2.0);
		CCir obj;
		Hw0909 a=new Hw0909();
		
		obj=a.compare(cir1,cir2);
		if(cir1==obj)
			System.out.println("radius of cir1 is larger");
		else
			System.out.println("radius of cir2 is larger");
		

	}

}
