package Chris.Chapter05.Loop;

public class Hw0514 {

	public static void main(String[] args) {
		int count = 0, l = 3500;
		for (l = 3500; l > 0; l = l / 2) {
			count++;
			if (l <3) {
				break;
			}
		}
		System.out.printf("L=%d公尺  Time=%d天", l, count);

	}

}
