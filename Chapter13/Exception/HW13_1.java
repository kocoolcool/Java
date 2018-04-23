package Chris.Chapter13.Exception;
 // HW13_1, 例外訊息的擷取
//(a)編譯時不會有錯誤訊息出現。
//這個例外是指發生在算術上的錯誤，由於程式中將den設值為0，又將den放在除數，
//而在數學上，0是不能當除數，因此Java在執行時拋出這個例外。
//(c)第8行不會被執行。因為Java在執行時拋出例外，並暫停程式的執行，因此第8行還來不及執行即被停止。
//必須使用try catch  java.lang.ArithmeticException

 public class HW13_1
 {
 public static void main(String args[])
 {
 int num=12,den=0;
 int ans=num/den;
 System.out.println("end of main() method !!");
 }
 }

