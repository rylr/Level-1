import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MathButtons implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton add;
	JButton mult;
	JTextField one,two;
	
	public static void main(String[] args) {
		MathButtons r = new MathButtons();
	}
	
	public MathButtons(){
		//GUI
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		
		
		panel = new JPanel();
		frame.add(panel);
		
		
		add = new JButton("Add");
		panel.add(add);
		add.setSize(50, 20);
		add.addActionListener(this);
		
		mult = new JButton("Multiply");
		panel.add(mult);
		mult.setSize(50, 20);
		mult.addActionListener(this);
		
		
		one = new JTextField(10);
		panel.add(one);
		
		
		two = new JTextField(10);
		panel.add(two);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int a = Integer.parseInt(one.getText());
		int b = Integer.parseInt(two.getText());
		int i = a+b;
		
		if (e.getSource() == add)
		{
			JOptionPane.showMessageDialog(null, "" + i);
		}
		
		if (e.getSource() == mult)
		{
			JOptionPane.showMessageDialog(null, "" + a*b);
		}

	}

}
