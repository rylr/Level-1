import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton trick;
	JButton treat;
	
	public static void main(String[] args) {
		NastySurprise r = new NastySurprise();
	}
	
	NastySurprise(){
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.add(panel);
		trick = new JButton("trick");
		panel.add(trick);
		trick.addActionListener(this);
		treat = new JButton("treat");
		panel.add(treat);
		treat.addActionListener(this);
		
		frame.pack();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==trick)
		{
			showPictureFromTheInternet("http://static.wixstatic.com/media/e51cae_14d203aa93df4438a60cbdc2edb40468.png_srz_449_423_85_22_0.50_1.20_0.00_png_srz");
		}
		if(e.getSource()==treat)
		{
			showPictureFromTheInternet("https://i.ytimg.com/vi/Xe6rcLa4Q98/maxresdefault.jpg");
		}
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
