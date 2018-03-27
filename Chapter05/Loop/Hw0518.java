package Chris.Chapter05.Loop;

public class Hw0518 {

	public static void main(String[] args) {

	
		
	for(int i=100000;i>0;i--) {
		boolean a=true;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
			a=false;
			break;
			}
		}
				
		if(a==true) {
		System.out.println(i);	
		break;
		}
	}	
	}	
}