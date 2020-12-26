package DEMO;

import java.util.Random;
import java.util.Scanner;

public class luckymoney {
	static public double total1, count1 = 1;

	public static void main(String[] args) {
		System.out.println("--------微信抢紅包--------");

		Scanner sc = new Scanner(System.in);
		System.out.println("   请输入红包总金额(元)：");

		double total = sc.nextDouble();
		while (total <= 0.01) {

			System.out.println("你输入的金额小于0.01，请重新输入！");
			double total1 = sc.nextDouble();

			total = total1;

		}

		System.out.println("   请输入红包个数：");

		int count = sc.nextInt();
		while (count <= 0) {

			System.out.println("您输入的红包个数应大于1个，请重新输入！");

			int count1 = sc.nextInt();
			count = (int) count1;
		}
		while ((total / count )< 0.01) {

			System.out.println("单个红包金额最少为0.01！请重新输入红包个数！");
			System.out.println("   请输入红包个数：");
			int count1 = sc.nextInt();
			count = count1;

		}
        
		double min = 0.01;
		Random c = new Random();
		for (int i = 1; i < count; i++) {
			double max = total - (count - i) * 0.01;
			double bound = max - min;
			double safe = (double) c.nextInt((int) (bound * 100)) / 100;
			double money = safe + min;
			total = total - money;
			System.out.println("第" + i + "个红包" + String.format("%.2f", money) + "元");

		}
		System.out.println("第" + count + "个红包" + String.format("%.2f", total) + "元");

		sc.close();
		
	}
	}

