package Chris.Chapter05.Loop;

public class Hw0515 {

	public static void main(String[] args) {
		int m;
		for(int i=1;i<=10;i++) {
			m=i*i;
			if(i*i<50) {
			  continue;
			}	
	
		System.out.println("i="+i+",i*i="+i*i);
		}
		
		
		//or(int i=1;i<=10;i++)
	      //{
	         //if(i*i<50)
	           // continue;
	         //System.out.println("i="+i+" ,i*i="+i*i);
	     // }
		
		
		//for(int i=1;i<=10;i++)
			//{
			//if(i*i<50)
			//continue;
			//System.out.println("i="+i+" ,i*i="+i*i);
			//}
	}

}
