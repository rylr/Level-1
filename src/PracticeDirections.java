import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PracticeDirections implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton up;
	JButton down;
	JButton left;
	JButton right;
	
	int last = 0;
	int up2 = 1;
	int down2 = 2;
	int left2 = 3;
	int right2 = 4;
	
	public static void main(String[] args) {
		PracticeDirections r = new PracticeDirections();
	}
	
	PracticeDirections(){
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.add(panel);
		
		up = new JButton("up");
		panel.add(up);
		up.addActionListener(this);
		
		down = new JButton("down");
		panel.add(down);
		down.addActionListener(this);
		
		left = new JButton("left");
		panel.add(left);
		left.addActionListener(this);
		
		right = new JButton("right");
		panel.add(right);
		right.addActionListener(this);
		
		frame.pack();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==up)
		{
			if(last != up2){
				System.out.println("up");
				last = up2;
			}
		}
		
		if(e.getSource()==down)
		{
			if(last != down2){
			System.out.println("down");
			last = down2;
			}
		}
		
		if(e.getSource()==left)
		{
			if(last != left2){
			System.out.println("left");
			last = left2;
			}
		}
		
		if(e.getSource()==right)
		{
			if(last != right2){
			System.out.println("right");
			last = right2;
			}
		}
	}
}