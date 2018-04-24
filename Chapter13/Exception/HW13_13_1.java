package Chris.Chapter13.Exception;
 // hw13_13_1,
 import java.io.*;

 class Exception5201 extends Exception
 {
 }

 public class HW13_13_1
 {
 public static void main(String args[]) throws IOException
 {
 try
 {
 String str;
 BufferedReader buf;
 buf=new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Input a string:");
 str=buf.readLine();
 if(str.equals("520"))
 throw new Exception5201();
 else
 System.out.println("string="+str);
 }
 catch(Exception5201 e)
 {
 System.out.println("這是由字串520所引起的例外");
 }
 }
 }
