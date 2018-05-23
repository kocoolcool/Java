package Chris.Chapter15.Thread;
//多執行序結果為先搶先贏

public class HW15_3 {

	public static void main(String[] args) {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("GoodBye");

		hi.start();
		bye.start();

	}

}
