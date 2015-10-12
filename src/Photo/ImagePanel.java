package Photo;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	BufferedImage bi;
	public int ImageWidthGlobal;
	public int ImageHeightGlobal;

	public ImagePanel(String filename, int ImageWidth, int ImageHeight)
	{
		try {
			bi = ImageIO.read(this.getClass().getResourceAsStream(filename));
			
			ImageWidthGlobal = ImageWidth;
			ImageHeightGlobal = ImageHeight;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawImage(bi, 0, 0, ImageWidthGlobal, ImageHeightGlobal, null);
	}
	
}