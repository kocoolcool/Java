package Chris.Chapter09.AdvacedClass;
class Power{
	 void power(int x,int n){
		System.out.println(x+"*"+n+":"+Math.pow(x, n));
	}
}
public class Hw0907 {
	
	public static void main(String[] args) {
		Power a=new Power();
		a.power(2, 5);
		a.power(3, 2);

	}

}
