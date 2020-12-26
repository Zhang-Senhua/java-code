package demo11;

public class demo2 {
	public static void main(String[] args) {
		person p1 = new person();
		person p2 = new person();
		person p3 = new person();
		p1.name = "小明";
		p1.id = "123";

		p2.name = "小红";
		p2.id = "123";

		p3.name = "小明";
		p3.id = "456";
       System.out.println(p1.equals(p2));
       System.out.println(p1.equals(p3));
       System.out.println(p2.equals(p3));
	}

	public demo2() {
		// TODO Auto-generated constructor stub
	}

}
