package Chris.Chapter14.Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HW14_5 {

	public static void main(String[] args) throws IOException  {
		char[] data=new char[128];
		FileReader  Fil=new FileReader("C:\\donkey.txt");
		Fil.skip(9);
		int num=	Fil.read(data);
		String str=new String(data,0,num);
		System.out.println("num="+num);
		System.out.println("str.length"+str.length());
		System.out.println(str);
	}

}
