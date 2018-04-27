package Chris.Chapter14.Files;

import java.io.FileInputStream;
import java.io.IOException;

public class HW14_13_1 {

	public static void main(String[] args) throws IOException  {

int[]	arr =new int[1000];
		FileInputStream FIS=new FileInputStream("c:\\test\\rand.txt");
		
		int i=0;int max=0;int min=99999;long sum=0;
		byte[]array=new byte[FIS.available()];
		FIS.read(array);
		String str=new String(array);
		String str2[]= str.split("\r\n");
		for( i=0;i<str2.length;i++) {
//			System.out.println(Integer.parseInt(str2[i]));
			sum=sum+Integer.parseInt(str2[i]);
			
			if(max<Integer.parseInt(str2[i]))
				max=Integer.parseInt(str2[i]);
			
			if(min>Integer.parseInt(str2[i]))
				min=Integer.parseInt(str2[i]);
		}
			
			System.out.println("MAX="+max);
			System.out.println("MIN="+min);
			System.out.println("AVG="+sum/1000);
		    FIS.close();	
	}
	
}
