package game;

import javax.swing.JFrame;

//1.游戏窗体，创建鱼池，固定游戏界面
//2.继承JFrame类
//3.写一个构造器，确定窗体的特征
public class GameFrame extends JFrame {

	public GameFrame() {

		// 设置窗体的标题
		setTitle("叫你玩游戏");

		setSize(800, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	// 程序入口
	public static void main(String[] args) {
		// 使用模具创建出游戏游戏窗体
		// 格式：类名 对象名
		// 创建出创建出窗体对象
		// 创建游戏画板对象

		GameFrame frame = new GameFrame();
		Gamepanel panel = new Gamepanel();
		frame.add(panel);//开始游戏
		panel.action();
		frame.setVisible(true);
      
	}

}
