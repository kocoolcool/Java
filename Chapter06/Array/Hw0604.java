package Chris.Chapter06.Array;

public class Hw0604 {

public static void main(String[] args) {
int array[]= {3,5,0,3,2,4,1,6,8,5,4,3,2};
int count=0,a=0;
System.out.println(array.length);
	for(int i=0;i<array.length;i++) {
	count++;
	if(3<=array[i]&&array[i]<=6) {
		a++;
		System.out.println(array[i]);}
	}
	
	System.out.println(count);
	System.out.println(a);
}
}
