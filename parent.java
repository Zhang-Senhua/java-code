  package demo11;

public class parent {
	
	
	
	
	public static void main(String[] args) {
		Person1 tom=new student("tom");
		                //用父类声明对象，用子类实例化，这是向上转型
	System.out.println("调用int(a)方法"+add(1));
	
	System.out.println("调用int(a,b)方法"+add(1,8));
	
	
	}                   //此次的student 可用 person替换

	static int add(int  a) {
		return a;
	}
	static int add(int a,int b) {
		return a+b;
		
	}
	public parent() {
		// TODO Auto-generated constructor stub
	}

}
 