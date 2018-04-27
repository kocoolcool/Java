package Chris.Chapter14.Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HW14_10 {

	public static void main(String[] args) throws IOException  {
	
		BufferedWriter bfw=new BufferedWriter(new FileWriter("c:\\test\\rand.txt"));
		for(int i=1;i<=1000;i++) {
		Double num=new Double(Math.random()*100000);
		String	x=Integer.toString(num.intValue());
			bfw.write(x);
			bfw.newLine();
		}
		bfw.flush();
		bfw.close();
	}

}
