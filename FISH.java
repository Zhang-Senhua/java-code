package game;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 鱼类
 * /
 */
public class FISH extends Thread {
	// 特点就是属性
	// 鱼的图片
	// 鱼的坐标
	// 鱼的大小(宽度，高度）
	BufferedImage img;
	int x;
	int y;
	int w;
	int h;
	// 随机数对象
	Random ran = new Random();

	// 定义一个鱼游动的集合；
	List<BufferedImage> animation = new ArrayList<BufferedImage>();
//定义一个面板
	Gamepanel panel;
	// 定义鱼被捕

	boolean caught = false;

	List<BufferedImage> catchanimation = new ArrayList<BufferedImage>();

	// 定义一个与被捕时的数量
	 static int catchNUM;

	public FISH(Gamepanel panel) {
		this.panel = panel;
		// 随机鱼的种类
		int index = ran.nextInt(9) + 1;

		String fishName = "../img/fish0" + index + "_";
		// 加载鱼游动时的图片
		for (int i = 1; i < 11; i++) {

			// 小于10的时候 01 02 03 ....10
			String prefix = (i == 10 ? "" : "0") + i;
			// 拼接完整路径
			String path = fishName + prefix + ".png";
			BufferedImage img = imageutil.getImg(path);
			animation.add(img);
		}
		catchNUM = index <= 7 ? 2 : 4;
//将鱼的动画图片装到集合中

		for (int i = 1; i <= catchNUM; i++) {
			// 拼接图片路径
			String path = fishName + "catch_0" + i + ".png";
			// 根据路径加载图片
			BufferedImage img = imageutil.getImg(path);

			catchanimation.add(img);
		}
		// 初始化被捕鱼的数量
		// 确定鱼显示的图片

		// img=imageutil.getImg("../img/fish02_01.png");
		img = animation.get(0);

		w = img.getWidth();
		h = img.getHeight();

		x = ran.nextInt(800 - w);
		y = ran.nextInt(480 - h);

		// TODO Auto-generated constructor stub
	}

	// 鱼移动的步数
	int stepnum = 0;//

//鱼移动的方法
	public void move() {
		stepnum++;
		// 切换图片
		img = animation.get(stepnum % 10);// 不需要使用if条件语句进行判断，直接使用取余数的方法完成循环
//
		w = img.getWidth();
		h = img.getHeight();

		x -= ran.nextInt(3) + 1;
		if (x <= -w) {

			x = 800;
			y = ran.nextInt(480 - h);

		}
	}

	// 鱼向右移动
	public void run() {
		// 死循环
		// 调用鱼的移动
		super.run();
		for (;;) {
			// 检测鱼是否被捕
			if (caught) {
				// 显示被捕动画
				fishOver();
				x = 800;
				y = ran.nextInt(480 - h);

			}
			move();
			// 鱼太快，休眠
			try {
				Thread.sleep(100);
				panel.repaint();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
	}

//鱼被捕的动画
	private void fishOver() {
		for (int j = 0; j < 4; j++) {
			// TODO Auto-generated method stub
			// 从集合中遍历出图片
			for (int i = 0; i < catchNUM; i++) {
				img = catchanimation.get(i);
				w = img.getWidth();
				h = img.getHeight();
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			}

		}

	}

}
