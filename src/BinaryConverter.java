import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class BinaryConverter implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton convert;
	JTextField input;
	JTextField output;
	
	
	public static void main(String[] args) {
		BinaryConverter r = new BinaryConverter();
	}
	
	public BinaryConverter()
	{
		
		//GUI
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		
		input = new JTextField(20);
		panel.add(input);
		
		convert = new JButton("Convert");
		panel.add(convert);
		convert.addActionListener(this);

		output = new JTextField(20);
		panel.add(output);
		
		frame.add(panel);
		frame.pack();
	}
	

		int convert(String binary) 
		{
			//if(binary.length() != 8)
			//{
			//	JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			//	return 0;
			//}
			 //if(!Pattern.matches("\2", binary)) 
			 //{
			//	 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			//		return 0;
			// }
			try 
			{
				int asciiValue = Integer.parseInt(binary, 2);
				return asciiValue;
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
				//question.setText("");
				return 0;
			}
		}
		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==convert)
			{
				output.setText(convert(input.getText()) + "");
			}
		}
	}

