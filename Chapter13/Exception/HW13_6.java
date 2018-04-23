package Chris.Chapter13.Exception;


 public class HW13_6
 {
 public static void main(String args[])
 {
 int num=12;
 int den[]={12,8,3,8,8,4};
try {

 for(int i=0;i<10;i++)


 System.out.println("ans="+num/den[i]);
}
 catch(Exception e) {
	 System.out.println("捕捉到例外了");
 }
 }
 }
  
