package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/*java常用的面板
 * 自定义画板步骤
 * 1.定义类
 * 2.继承JPanel
 * 3.写一个构造器，确定面板的特点
 * 
 */
public class Gamepanel extends JPanel {
//定义分数 
	 static public int score=0;//定义初始分数
	 static public int caughtfishnumbers =0;//定义被捕鱼的数量
	 
	
	

	// 定义一张背景图
	BufferedImage bg;
	// 定义一条鱼
	FISH fish = new FISH(this);

	// 定义鱼塘中鱼的条数；
	int fishNUM = 200;
	// 鱼的集合，池塘里所有的鱼
	List<FISH> fishes = new ArrayList<>();
	net net = new net();
	// 定义渔网显示
	boolean netshow = true;

	public Gamepanel() {
		// 设置背景色

		// 使用工具类读取指定路径上的图片

		bg = imageutil.getImg("../img/bg04.jpg");
		// 创建所有的鱼装到集合中
		// TODO Auto-generated constructor stub
		for (int i = 0; i < fishNUM; i++) {
			fishes.add(new FISH(this));

		}
		creatMouseListener();

		// 开始鼠标监听器
	}// 游戏开始的方法

	public void action() {

		for (int i = 0; i < fishNUM; i++) {

			// 获取每一条鱼
			FISH fish = fishes.get(i);
			fish.start();
		}
	}

	// 画图的方法 g相当于画笔
	public void creatMouseListener() {
		MouseAdapter adapter = new MouseAdapter() {

			public void mouseMoved(MouseEvent e) {

				int mouse_x = e.getX();
				int mouse_y = e.getY();
				net.x = mouse_x - net.w / 2;
				net.y = mouse_y - net.h / 2;
				repaint();

			}

			// 鼠标移出事件
			public void mouseExited(MouseEvent e) {

				netshow = false;
				repaint();
			}

			// 鼠标切入
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseEntered(e);
				netshow = true;
				repaint();
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);

				int key = e.getModifiers();
				// System.out.println(key);
				// 点击左16 右4

				if (key == 16) {
					catchFish();

				}
				if (key == 4) {
					// 切换渔网增大火力
					changeNet();
					// 重新获取鼠标位置
					// 渔网从新跟随
					int mouse_x = e.getX();
					int mouse_y = e.getY();
					net.x = mouse_x - net.w / 2;
					net.y = mouse_y - net.h / 2;
					repaint();
				}
			}

		};

		addMouseMotionListener(adapter);
		addMouseListener(adapter);
		// 鼠标点击
		// 获取鱼的实时位置

	}

	int power = 1;

	public void catchFish() {

		for (int i = 0; i < fishNUM; i++) {

			FISH fish = fishes.get(i);
			if (net.catchFish(fish)) {
				fish.caught = true;

			}
		}

	}

	private void changeNet() {
		// TODO Auto-generated method stub

		// 也可以使用三目运算符
		if (power < 7) {
			power++;

		} else {
			power = 1;
		}

		net.change(power);
	}
	public void changescore() {
		   
		 if (score<=100000) {
			score=FISH.catchNUM*10;
			
		 }
		 scoremanager.changescore(score);
		 
	 }

	
	public void paint(Graphics g) {
		// 画背景图
		// g.drawImge(图片，横坐标，纵坐标，null)

		g.drawImage(bg, 0, 0, null);
		for (int i = 0; i < fishNUM; i++) {
			FISH fish = fishes.get(i);

			g.drawImage(fish.img, fish.x, fish.y, fish.w, fish.h, null);

		}
		g.setColor(Color.yellow);
		g.setFont(new Font("楷体", Font.BOLD, 20));
		//g.drawString(("子弹数：100"), 300, 30);
		g.drawString("火力值：" + power, 650, 30);
		g.drawString("分数:"+score, 20, 30);
		g.drawString("点击鼠标右键增加火力", 550, 60);
		// 绘制所有鱼
		if (netshow == true) {
			g.drawImage(net.img, net.x, net.y, net.w, net.h, null);
		}

	}
	
	
	
	
}
