package Chris.Chapter06.Array;

public class Hw0606 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50},max=a[0],min=a[0],max_index=0,min_index=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
				max_index=i;
			}
			if(min>a[i]) {
				min=a[i];
				min_index=i;
			}
		}
	System.out.println("max:"+"a["+max_index+"]"+":"+max);
	System.out.println("min:"+"a["+min_index+"]"+":"+min);
	}

}
