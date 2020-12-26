package game;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/*获取图片的工具
 * 
 * /
 */
public class imageutil {

	public static BufferedImage getImg(String path) {
		// 规定读取图片的步骤
		// ImageIO 数据传输通道 类似自来水管
		// 使用到反射机制
		try {
			BufferedImage img = ImageIO.read(imageutil.class.getResource(path));

			// 读取到了返回
			// 没读到怎么办
			return img;
		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;
	}

}
