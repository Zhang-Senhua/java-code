import java.text.DecimalFormat;
import java.util.Date;

public class demo {

	/*public static void main(String[] args) {
		
		//Integer 包装类
		System.out.println("int类型 的最小值为 "+Integer.MAX_VALUE);
		System.out.println("int类型最小值为"+Integer.MIN_VALUE);
		Integer  intel=new Integer(123);
		System.out.println(intel);
		Integer  intel1=new Integer("123456789");
		System.out.println(intel1);
		
		//调用方法Interger.parseInt(可以是整型值，也可以是字符串类型)
		//调用。intValue()方法可以将字符串类型转变为整型
		 //string str1=Integer.toString （11,8）、、就是表示将11转化为八进制的数(需要转换的十进制的数，需要 转换的进制)
	//value of 也可以创建对象
	
	//布尔类型包装类 方法
	Boolean a1=new Boolean(true);
	System.out.println(a1.toString());//该方法可将布尔值转化为字符串
	//需要注意的是布尔类型 除了输入ture 默认返回值为false
	
	//byte 类 
	
	//double类 浮点类
	
	//number类
	Number num =new Double(1222222222222.3);
	System.out.println(num);
	
	//DecimalFormat df=new Decimal ("格式化模板")
	
	
	}*/
	static void format(String pattern,double i ) {
		DecimalFormat df =new DecimalFormat(pattern);
		System.out.println(i);
		System.out.println(pattern);
		System.out.println(df.format(i));
		
	}
	public static void main(String[] args) {
		format("####",123);
		format("###,###.###",123456.789);
		System.out.println("圆周率π的值为："+Math.PI);
		System.out.println("90度的正弦值为："+Math.sin(Math.PI/2));
		System.out.println("0的余弦值为:"+Math.cos(0));
		System.out.println("以10为底的2的对数值为："+Math.log10(2));
		System.out.println("四的平方根"+Math.sqrt(4));
		System.out.println("8的立方根："+Math.cbrt(8));
		System.out.println("2的2次方"+Math.pow(2, 5));//后面表示为多少次方
		//比较运算
		System.out.println("4与8中较小的一个为："	+Math.min(4, 8));
		System.out.println("-8的绝对值为："+Math.abs(-8));
		System.out.println("使用floor方法的效果为："+Math.floor(3.6));//向下取整
		System.out.println("四舍五入"+Math.round(5.8));
		//四舍五入的运算方法
		
		Date date=new Date();
		System.out.println(date);
		
	}
}
