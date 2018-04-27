package Chris.Chapter14.Files;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Arrays;

public class HW14_13_2 {

	public static void main(String[] args) throws IOException {
		
		int[] arr = new int[1000];
		FileInputStream FIS=new FileInputStream("c:\\test\\rand.txt");
		FileOutputStream FOS=new FileOutputStream("c:\\test\\rand2.txt");		
		int i = 0;
		byte array[]=new byte[FIS.available()];
		FIS.read(array);
		
		String str=new String(array);
		String[] strArray=str.split("\r\n");
		Arrays.sort(strArray);
		for(i=0;i<strArray.length;i++) {
			strArray[i]=strArray[i]+"\r\n";
		}

String	AString=Arrays.toString(strArray);

StringBuilder sb = new StringBuilder();
if(strArray.length > 0){
  for( i = 0 ; i < strArray.length; i++) {
    sb.append(i == 0 ? strArray[i] : "," + strArray[i]);
  }
}


// 移除方括弧二
String s = Arrays.toString(strArray);
s = s.substring(1, s.length() - 1); // 移除前後括弧
s = s.replaceAll("\\s+", ""); // 移除字串中的空白

System.out.println(s.replaceAll(",","\r\n"));
byte[] arr2=new byte [s.length()];
	arr2=s.replaceAll(",","\r\n").getBytes();
	FOS.write(arr2);
}

}
