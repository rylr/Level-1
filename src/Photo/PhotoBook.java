package Photo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PhotoBook implements ActionListener{
	JFrame window;
	JButton next;
	JButton prev;
	JButton random;
	ImagePanel imp;
	JPanel panel;
	
	public static void main(String[] args) {
		PhotoBook r = new PhotoBook();
	}
	
	public PhotoBook(){
		window = new JFrame();
		panel = new JPanel();
		imp = new ImagePanel("shaqfu.png", 156, 214);
		window.setLayout(null);
		next = new JButton("Next");
		prev = new JButton("Previous");
		random = new JButton("Random");
		
		
		window.add(imp);
		window.add(panel);
		
		panel.add(next);
		panel.add(prev);
		panel.add(random);
		panel.setBounds(0, 0, 120, 500);
		imp.setBounds(120, 0, 380, 500);
		
		
		window.setSize(500, 500);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		next.setBounds(10, 100, 100, 20);
		next.addActionListener(this);
		
		prev.setBounds(10, 200, 100, 20);
		prev.addActionListener(this);
		
		random.setBounds(10, 300, 100, 20);
		random.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==next)
		{
			
		}
		
		if(e.getSource()==prev)
		{
			
		}
		
		if(e.getSource()==random)
		{
			
		}
	}
}
