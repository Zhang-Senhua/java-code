package demo11;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class pratise {

	static public int score;
	double input, core, q, w = 0;// 定义分数各种，静态变量

	public static void main(String[] args) {

		DecimalFormat a1 = new DecimalFormat("#.00");

		/*
		 * System.out.println(number1); System.out.println(number2);
		 */
		int return1 = 1;

		while (return1 == 1) {
			Random q = new Random();// 游戏开始，生成第一个 随机数
			Random w = new Random();// 生成第二个随机数
			double number1 = q.nextDouble();
			double number2 = w.nextDouble();

			int a = q.nextInt(100);
			int b = q.nextInt(100);

			System.out.println("请输入你要挑战的等级：一级，二级，三级（请输入数字）");// 进行游戏等级选择
			Scanner sc = new Scanner(System.in);// 创建Scanner对象
			int grade = sc.nextInt();// 获取等级

			if (grade == 1) {// 等级1
				// double number3 = (int) (number1 * 10);// 处理随机数，转化为整型
				// double number4 = (int) (number2 * 10);// 处理随机数，转化为整型
				System.out.println(a);// 输出处理后的数据
				System.out.println(b);// 输出处理后的数据
				System.out.println("请输入 这两个数的和");// 进行加法运算
				int input = sc.nextInt();// 用户输入计算结果

				if (input == a + b) {// 判断结果是否正确

					System.out.println("恭喜你答对了");
					score = score + 1;
					System.out.println("目前你的得分为" + score + "分");
				} else {
					System.out.println("你输入的答案错误");

				}

				System.out.println("是否选择继续答题，继续输入1，退出输入2");
				int core = sc.nextInt();
				if (core == 2) {
					break;
				}

			}

			if (grade == 2) {// 等级2
				double number3 = (double) Math.round(number1 * 10) / 10;
				double number4 = (double) Math.round(number2 * 10) / 10;

				System.out.println(number3);// 输出处理后的数据
				System.out.println(number4);// 输出处理后的数据
				System.out.println("请输入 这两个数的积");// 进行加法运算
				double input = sc.nextDouble();
				// 用户输入计算结果

				if (input == number3 * number4) {// 判断结果是否正确

					System.out.println("恭喜你答对了");
					score = score + 2;
					System.out.println("目前你的得分为" + score + "分");
				} else {
					System.out.println("你输入的答案错误");

				}

				System.out.println("是否选择继续答题，继续输入1，退出输入2");
				int core = sc.nextInt();
				if (core == 2) {

					break;
				}

			}

			if (grade == 3) {// 等级3
				double number3 = (double) Math.round(number1 * 100) / 100;
				double number4 = (double) Math.round(number2 * 100) / 100;
				System.out.println(number3);// 输出处理后的数据
				System.out.println(number4);// 输出处理后的数据
				System.out.println("请输入 这两个数的积");// 进行加法运算
				double input = sc.nextDouble();// 用户输入计算结果

				if (input == number3 * number4) {// 判断结果是否正确

					System.out.println("恭喜你答对了");
					score = score + 3;
					System.out.println("目前你的得分为" + score + "分");
				} else {
					System.out.println("你输入的答案错误");

				}

				System.out.println("是否选择继续答题，继续输入1，退出输入2");
				int core = sc.nextInt();
				if (core == 2) {
					break;
				}

			}
		}

		System.out.println("游戏结束，本场游戏得分为:" + score);

	}

}
