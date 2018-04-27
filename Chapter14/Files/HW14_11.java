package Chris.Chapter14.Files;

import java.io.FileInputStream;
import java.io.IOException;

public class HW14_11 {

	public static void main(String[] args) throws IOException {
		String str;
		int count = 0;
		FileInputStream fps = new FileInputStream("C:\\test\\number.txt");
		byte[] arr = new byte[fps.available()];
		// System.out.println(fps.available());

		fps.read(arr);
		String str1= new String(arr);
		System.out.println(new String(arr));
		char[] arr1 = str1.toCharArray();
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == '\r')

				count++;

		}
		System.out.println(count +1+ " lines read");

		fps.close();
	}
}
