package Chris.Chapter10.Extend;
// hw10_16, has-a與is-a


/*在CRectangle類別裡，CRectangle類別「has-a」length、width及show() method。
CData類別繼承CRectangle類別，因此CData類別「is-a」CRectangle類別。
*/
 class CRectangle1
 {
 private int length;
 private int width;

 {
 System.out.print("length="+length);
 System.out.println(", width="+width);
}
 }

 class CData2 extends CRectangle1
 { }
public class HW10_16 {

	public static void main(String[] args) {
		

	}

}
