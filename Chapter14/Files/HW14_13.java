package Chris.Chapter14.Files;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class HW14_13 {

	public static void main(String[] args) throws IOException {
		FileOutputStream FOS = new FileOutputStream("c:\\test\\rand.txt");

		for (int i = 1; i <= 1000; i++) {
			Double num = new Double(Math.random() * 100000);
			String x = Integer.toString(num.intValue());
			if (i <1000) {
				x += "\r\n";
			}
				byte[] array = x.getBytes();

				FOS.write(array);
			
		}
		FOS.close();
	}

}
