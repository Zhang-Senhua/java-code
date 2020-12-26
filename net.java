package game;

import java.awt.image.BufferedImage;

public class net {
//
	static public int score1;boolean hit;
	
	BufferedImage img;
	int x;// 定义图片的位置，与高度
	int y;// 定义图片的位置，与高度
	int w;// 定义图片的位置，与高度
	int h;// 定义图片的位置，与高度

	public net() {
		// 确定渔网的图片
		// TODO Auto-generated constructor stub

		img = imageutil.getImg("../img/net_1.png");
		// 缺定高度与宽度
		w = img.getWidth();
		h = img.getHeight();

		// 确定渔网初始位置
		x = 200;
		y = 200;

	}

//渔网的切换
	public void change(int power) {
		// TODO Auto-generated method stub

		img = imageutil.getImg("../img/net_" + power + ".png");//
		// 重新获取
		w = img.getWidth();
		h = img.getHeight();
	}

	// 捕鱼
	public boolean catchFish(FISH f) {

		boolean hit = f.x <= x + w && f.x >= x - f.w && f.y <= y + h && f.y >= y - f.h;
				return hit;

	}
	

}
