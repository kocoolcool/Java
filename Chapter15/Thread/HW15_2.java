package Chris.Chapter15.Thread;
//單執行結果會先執行hi再執行bye
class CTest extends Thread {
	String id;

	CTest(String str) {
		id = str;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 100000; j++)
				;
			System.out.println(id + "" + i);
		}
	}
}

public class HW15_2 {

	public static void main(String[] args) {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("GoodBye");
		hi.run();
		bye.run();
		;
	}

}
