package Chris.Chapter14.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class HW14_8 {

	public static void main(String[] args) throws Exception {
		String str;
		BufferedReader bfr=new BufferedReader(new FileReader("C:\\test\\aaa.txt"));
		BufferedReader bfr1=new BufferedReader(new FileReader("C:\\test\\bbb.txt"));
		BufferedWriter bfw=new BufferedWriter(new FileWriter("C:\\test\\ccc.txt",true));
		while((str=bfr.readLine())!=null) {
						
						bfw.write(str);
						bfw.newLine();
			          System.out.println("完成寫入Ａ");
		}
		while((str=bfr1.readLine())!=null) {
			
			bfw.write(str);
			bfw.newLine();
			System.out.println("完成寫入Ｂ");
}
		 bfw.flush();
		 bfw.close();
		 bfr.close();
	}
}
