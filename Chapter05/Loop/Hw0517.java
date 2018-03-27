package Chris.Chapter05.Loop;

public class Hw0517 {

	public static void main(String[] args) {
		for(int i=1; i<6; i++){
			for(int j=1; j<6; j++){
			if(i<=j)
				continue;
			
			System.out.println("i="+i+",j="+j);
			}
			

		}

	}
}