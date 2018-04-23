package Chris.Chapter11.Abstract;
 // 11_12,
 interface Data1
 {
 public void best(); // 判斷那一科成績較高
 public void failed(); // 判斷那一科成績低於60分
 }
 interface Test1 extends Data1
 {
 public void showData(); // 顯示學生的資料及平均成績
 public double average(); // 計算數學和英文的平均成績
 }
 class CStu1 implements Test1
 {
	
 protected String name; // 姓名
 protected int math; // 數學成績
 protected int english; // 英文成績
 CStu1(String a,int b,int c){
	 name=a;
	 math=b;
	 english=c;
 }
@Override
public void best() {
	System.out.println( "best="+((math>english) ?math:english));
	
}
@Override
public void failed() {
	if(math<60)
	System.out.println("math<60");
	if(english<60)
	System.out.println("english<60");
	
}
@Override
public void showData() {
	System.out.println("name="+name);
	System.out.println("math="+math);
	System.out.println("english="+english);
	
}
@Override
public double average() {
;
	return (math+english)/2;
}
public void show() {
	showData();
	best();
	failed();
	System.out.println("average"+average());
}

 }

 public class HW11_12
 {
 public static void main(String args[])
 {
 CStu1 stu=new CStu1("Judy",58,91);
 stu.show();
 }
 }

