package DEMO3;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class WINDOW {
public static void main(String[] args) {
	JFrame F=new JFrame("窗体标题");
	//设置标题
F.setVisible(true);

F.setBounds(300, 300, 700, 700);

F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );

Container c=F.getContentPane();
c.setBackground(Color.green);
JLabel l =new JLabel("this is a window");
c.add(l);//删除组件
c.validate();//验证容器中的组件

F.setResizable(false);
System.out.println(F.getX()+F.getY());
}
	public WINDOW() {
		// TODO Auto-generated constructor stub
	}

}
