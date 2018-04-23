package Chris.Chapter13.Exception;
 // HW13_2, 例外訊息的擷取


 public class HW13_2
 {
 public static void main(String args[])
 {
 int num=12,den=2;
 if(den==0)
	 System.out.println("除數為0");
 else {
	 int ans=num/den;
	 System.out.println(num+"/"+den+"="+ans);
 }
 }
 }

