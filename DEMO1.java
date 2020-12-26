package mytest;

public class DEMO1 { // 什么东西
						// 成员变量(类中的属性 )
	String wing;
	String claw;
	String beak;
	String feather;
    String taget;
	public void gaze(String target) { // 成员方法 做什么  成员方法只有被调用才会被运行
	//private  其他类不能用                    //构造方法在 new 后才会被运行
    //protected 其他包不能使用									// 凝视 目标是taget
		int id = 0; // 局部变量 从声明开始到声明结束
		System.out.println(id + wing);
	}
//方法中调用的是参数中中的 列如（taget 就是参数）而不是类中的成员变量
	//成员变量与参数相同时 使用this 关键字  代表类中的对象
	public DEMO1() {
		//始化 自动创建类方法
		
		//调用类的静态方法无需创建类的对象
		
	}

static public void show() {
	System.out.println("静态方法无需实例化就可调用");
}
	
}
