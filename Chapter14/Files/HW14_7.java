package Chris.Chapter14.Files;


// hw14_7,
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 public class HW14_7
 {
 public static void main(String args[]) throws IOException
 {
 int count=0;
 String str;
 FileReader fr=new FileReader("c:\\donkey.txt");
 BufferedReader bfr=new BufferedReader(fr);

 while((str=bfr.readLine())!=null)
 {
 if(count==2)
 continue;
 System.out.println(str);
 count++;
 }
 fr.close();
 }
 }
