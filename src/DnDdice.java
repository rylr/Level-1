import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class DnDdice implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	JButton four;
	JButton six;
	JButton eight;
	JButton ten;
	JButton twelve;
	JButton twenty;
	JButton clear;
	JLabel current;
	JLabel total;
	JTextField mod;
	Random r;
	
	int a;
	int b;
	
	int currentRoll;
	int totalRoll;
	
	public static void main(String[] args) {
		DnDdice n = new DnDdice();
	}
	
	public DnDdice(){
		r = new Random();
		
		//GUI
			frame = new JFrame();
			frame.setVisible(true);
			frame.setSize(300, 600);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			
			panel = new JPanel();
				
			
			four = new JButton("4");
			panel.add(four);
			four.setBounds(10, 75, 100, 25);
			four.addActionListener(this);
			
			
			six = new JButton("6");
			panel.add(six);
			six.setBounds(10, 150, 100, 25);
			six.addActionListener(this);
			
			
			eight = new JButton("8");
			panel.add(eight);
			eight.setBounds(10, 225, 100, 25);
			eight.addActionListener(this);
			
			
			ten = new JButton("10");
			panel.add(ten);
			ten.setBounds(10, 300, 100, 25);
			ten.addActionListener(this);
			
			
			twelve = new JButton("12");
			panel.add(twelve);
			twelve.setBounds(10, 375, 100, 25);
			twelve.addActionListener(this);
			
			
			twenty = new JButton("20");
			panel.add(twenty);
			twenty.setBounds(10, 450, 100, 25);
			twenty.addActionListener(this);
			
			
			clear = new JButton("Clear");
			panel.add(clear);
			clear.setBounds(10, 525, 100, 25);
			clear.addActionListener(this);
			
			current = new JLabel("Current:");
			panel.add(current);
			current.setBounds(200, 200, 100, 100);
			current.setText("Current:" + 0);
			
			total = new JLabel("Total:");
			panel.add(total);
			total.setBounds(200, 400, 100, 100);
			total.setText("Total:" + 0);
			
			mod = new JTextField();
			panel.add(mod);
			mod.setBounds(200, 50, 100, 25);
			
			
			panel.setLayout(null);
			frame.add(panel);	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==four)
		{
			int modifier = Integer.parseInt(mod.getText());
			currentRoll = r.nextInt(4) + 1;
			current.setText("Current:" + currentRoll);
			totalRoll  = totalRoll += currentRoll;
			total.setText("Total:" + (totalRoll + modifier));
		}
		
		if(e.getSource()==six)
		{
			int modifier = Integer.parseInt(mod.getText());
			currentRoll = r.nextInt(6) + 1;
			current.setText("Current:" + currentRoll);
			totalRoll  = totalRoll += currentRoll;
			total.setText("Total:" + (totalRoll + modifier));
		}
		
		if(e.getSource()==eight)
		{
			int modifier = Integer.parseInt(mod.getText());
			currentRoll = r.nextInt(8) + 1;
			current.setText("Current:" + currentRoll);
			totalRoll  = totalRoll += currentRoll;
			total.setText("Total:" + (totalRoll + modifier));
		}
		
		if(e.getSource()==ten)
		{
			int modifier = Integer.parseInt(mod.getText());
			currentRoll = r.nextInt(10) + 1;
			current.setText("Current:" + currentRoll);
			totalRoll  = totalRoll += currentRoll;
			total.setText("Total:" + (totalRoll + modifier));
		}
		
		if(e.getSource()==twelve)
		{
			int modifier = Integer.parseInt(mod.getText());
			currentRoll = r.nextInt(12) + 1;
			current.setText("Current:" + currentRoll);
			totalRoll  = totalRoll += currentRoll;
			total.setText("Total:" + (totalRoll + modifier));
		}
		
		if(e.getSource()==twenty)
		{
			int modifier = Integer.parseInt(mod.getText());
			currentRoll = r.nextInt(20) + 1;
			current.setText("Current:" + currentRoll);
			totalRoll  = totalRoll += currentRoll;
			total.setText("Total:" + (totalRoll + modifier));
		}
		
		if(e.getSource()==clear)
		{
			current.setText("Current:" + 0);
			totalRoll = 0;
			total.setText("Total:" + 0);
		}
	}	
}
