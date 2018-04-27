package Chris.Chapter14.Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HW14_12 {

	public static void main(String[] args) throws IOException {
		FileOutputStream FOS = new FileOutputStream("C:\\test\\random.txt");
		FileInputStream FIS=new FileInputStream("C:\\test\\random.txt");
		
		for (int i = 1; i <= 5; i++) {
			String str = Double.toString(Math.random());
			if (i < 5)
			str += "\r\n";
		byte[] y = str.getBytes();

			FOS.write(y);
		}
		byte x[]=new byte[FIS.available()];
		FIS.read(x);
		System.out.println(new String(x));
		FIS.close();
	}

}
