package Chris.Chapter11.Abstract;
class CShape15{
	
}
class CTriangle15 extends  CShape15{
	
}
class CCircle15 extends CShape15{
	
}
class CCoin15 extends CCircle15{
	
}
public class HW11_15 {

	public static void main(String[] args) {
		CCircle15 CCir=new CCircle15();
		CTriangle15 CTri=new CTriangle15();
		CCoin15 CCoi=new CCoin15();
		if(CCir instanceof CCoin15 ) 
			System.out.println("CCoin15是CCoin15的子類別");
		else 
			System.out.println("CCoin15不是CCoin15的子類別");
		if(CTri instanceof CShape15)
			System.out.println("CTriangle15是CShape15的子類別");
		else
			System.out.println("CTriangle15不是CShape15的子類別");
		if(CCoi instanceof Object)
			System.out.println("CCoin15是Object的子類別");
		else
			System.out.println("CCoin15不是Object的子類別");

	}

}
