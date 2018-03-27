package Chris.Chapter09.AdvacedClass;

class Namecard {
	private String name;
	private String address;
	private Phone data;

	public static class Phone {
		private String company;
		private String cell;

		public Phone(String s1, String s2) {
			company = s1;
			cell = s2;
			
		}
	}

	public void show() {

		System.out.print(name + address +  data.company + data.cell);
	}

	public Namecard(String a1, String a2, String s1, String s2) {
		name = a1;
		address = a2;
		data = new Phone(s1, s2);
	}

}

public class Hw0917 {

	public static void main(String[] args) {
		Namecard first = new Namecard("Andy\n", "123City\n", "2345-6789\n", "0911-336600\n");
		first.show();
	}

}
