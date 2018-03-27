package Chris.Chapter06.Array;

public class Hw0603 {

	public static void main(String[] args) {
		
		int a[]= {53,27,69,12,3,96},max=a[0],min=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			if(min>a[i])
				min=a[i];
			
System.out.print("max:"+max+"min:"+min);
	}

	}}
