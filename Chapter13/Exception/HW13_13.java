package Chris.Chapter13.Exception;
class Exception520 extends Exception{	
	
}
class a520{

	void	like520(String a) throws Exception520{
		String stringa=a;
		if(stringa.equals("520")  ) {
			throw new Exception520();
		}
		else {
			System.out.println(stringa);
		}
			
	}
}
public class HW13_13 {

	public static void main(String[] args) {
		a520 a=new a520();
		try {
			a.like520("620");
		} catch (Exception520 e) {
			
			System.out.println("這是由字串520所引起的例外");
		}

	}

}
