package Chris.Chapter14.Files;

import java.io.FileReader;
import java.io.IOException;

public class HW14_6 {

	public static void main(String[] args) {
		try {
			char data[] = new char[128];
			FileReader fr = new FileReader("c:\\donkey.txt");

			int num = fr.read(data);
			String str = new String(data, 0, num);
			System.out.println("Characters read= " + num);
			System.out.println(str);
			fr.close();
		} catch (IOException e) {
		}
	}
}
