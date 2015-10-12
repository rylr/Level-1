import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUISlotMachine implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton spin;
	JTextField bet;
	JLabel one;
	JLabel two;
	JLabel three;
	JLabel betValue;
	JLabel totalValue;
	
	int totalCash = 1000;
	int betCash = 0;
	
	public static void main(String[] args) {
		GUISlotMachine r = new GUISlotMachine();
	}
	
	public GUISlotMachine()
	{
		//GUI
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setLayout(null);
		
		panel.setBounds(0, 0, 500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		betValue = new JLabel("Bet:");
		panel.add(betValue);
		betValue.setBounds(10, 10, 30, 20);
		
		bet = new JTextField(10);
		panel.add(bet);
		bet.setBounds(50, 10, 30, 20);
		int betCash = bet.getText(Integer.parseInt(""));
		//betCash = Integer.parseInt(bet.getText());
		
		spin = new JButton("Spin");
		panel.add(spin);
		spin.setBounds(175, 200, 75, 75);
		spin.addActionListener(this);
		
		one = new JLabel("0");
		panel.add(one);
		one.setBounds(50, 350, 150, 100);
		
		two = new JLabel("0");
		panel.add(two);
		two.setBounds(200, 350, 150, 100);
		
		three = new JLabel("0");
		panel.add(three);
		three.setBounds(350, 350, 150, 100);

		totalValue = new JLabel("Cash: 1000");
		panel.add(totalValue);
		totalValue.setBounds(20, 150, 200, 40);
		//totalValue.setText("Cash: " + totalCash);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==spin)
		{
			totalCash - betCash;
			one.setText(Random.nextInt(2) + 1);
			two.setText(Random.nextInt(2) + 1);
			three.setText(Random.nextInt(2) + 1);
			
			if(one == two && two == three){
				totalCash + betCash * 10;
			}
		}
	}
}
