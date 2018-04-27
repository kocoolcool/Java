package Chris.Chapter14.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class HW14_9 {

	public static void main(String[] args) throws Exception {
		String str;
		BufferedReader bfr=new BufferedReader(new FileReader("C:\\test\\aaa.txt"));
		BufferedReader bfr1=new BufferedReader(new FileReader("C:\\test\\bbb.txt"));
		BufferedReader bfr2=new BufferedReader(new FileReader("C:\\test\\ccc.txt"));
		while((str=bfr.readLine())!=null) {
						
						System.out.println(str);
		}
		while((str=bfr1.readLine())!=null) {
			
		System.out.println(str);
}
		while((str=bfr2.readLine())!=null) {
			
			System.out.println(str);
}
		 bfr.close();
		 bfr1.close();
	}
}
