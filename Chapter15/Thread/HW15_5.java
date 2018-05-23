package Chris.Chapter15.Thread;
//多執行序結果為先搶先贏

public class HW15_5 {

	public static void main(String[] args) {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("GoodBye");
		CTest morning = new CTest("Good morning");
		CTest night = new CTest("Good night");
		hi.start();
		bye.start();
		night.start();
		morning.start();
	}

}
