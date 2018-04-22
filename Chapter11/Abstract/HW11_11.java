package Chris.Chapter11.Abstract;

// HW11_11, 多重繼承的練習


interface Data {
	public void showData();
}

interface Test {
	public void showScore();

	public double calcu();
}

class CStu implements Data,Test {
	
	
	protected String id; // 學號
	protected String name; // 姓名

	protected int mid; // 期中考成績
	protected int finl; // 期末考成績
	protected int common; // 平時成績
	CStu(String a,String b ,int c,int d,int e){
		id=a;
		name=b;
		mid=c;
		finl=d;
		common=e;
	}
	@Override
	public void showScore() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double calcu() {
		
		return (mid+finl)*0.3+common*0.4;
	}
	@Override
	public void showData() {
		System.out.println("id="+id+",name="+name);
		
	}
	void show() {
		showData();
		System.out.println("mid="+mid);
		System.out.println("finl="+finl);
		System.out.println("common="+common);
		System.out.println("score="+calcu());
	}
}

public class HW11_11 {
	public static void main(String args[]) {
		CStu stu = new CStu("940001", "Fiona",90,92,85);
		stu.show();
	}
}
