package Chris.Chapter10.Extend;
class CRectangle4{
	protected int length;
	protected int width;
	CRectangle4(int l,int w){
		length=l;
		width=w;
	}
}
public class HW10_19 {

	public static void main(String[] args) {
		CRectangle4 rect=new CRectangle4(2,6);
System.out.println("length="+rect.length+",width="+rect.width+",area="+rect.length*rect.width);
	}

}
