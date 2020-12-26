package DEMO;

public class pool {
	static public int water = 0;// 静态变量初始值水量为0，静态变量可被多次改变并赋值
   // final static    静态常量不能被修改
	public void outlet() {// 创建成员方法 进水
		if (water >= 2) {
			water = water - 2;
		} else {
			water = 0;
		}
	}
	public void inlet() { // 创建 出水 成员方法
		water = water + 3;
	}
	public static void main(String[] args) {// main为主方法
		pool out = new pool();
		pool in = new pool();
		System.out.println("水池中的水量" + pool.water);		
		System.out.println("向水池中注水四次");
		in.inlet();
		in.inlet();
		in.inlet();
		in.inlet();
		System.out.println("水池中的水量" + pool.water);
		System.out.println("水池放水两次");
		out.outlet();
		out.outlet();
		System.out.println("水池中的水量" + pool.water);
	}// 由程序可知，执行过程中改变的量为同一个变量，即静态变量    
	public pool() {
		
 		// TODO Auto-generated constructor stub
	}

}
