package demo11;

public class wrong {

	public static void main(String[] args) {
		/*try {
			int a = 1;
			Object d = null;
			d.notify();
			System.out.println(d);

		} catch (ArithmeticException w) {
			System.out.println("发生异常，请管理员及时处理！");
		}

		catch (NullPointerException g) {
			System.out.println("空指针异常，请管理员及时处理！");
		} finally {
			System.out.println("实时保存文件！");
		}

	*/
		try {
			String playertype="monkey";
		if(!playertype.equals("humans")) {
			throw new NonHumansException("有非人类选手"+playertype);
			
			
			
		}
	System.out.println("开始比赛");
	
		} catch ( NonHumansException e) {
			e.printStackTrace();
		}
	
	
	
	}
}
