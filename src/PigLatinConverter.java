import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinConverter implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JTextField input;
	JTextField output;
	JButton button;

	public static void main(String[] args)
	{
		PigLatinConverter r = new PigLatinConverter();
	}

	public PigLatinConverter()
	{
		// GUI
		frame = new JFrame();
		panel = new JPanel();
		panel.setLayout(null);
		input = new JTextField();
		output = new JTextField();
		button = new JButton("Covert");
		button.addActionListener(this);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(input);
		panel.add(output);
		panel.add(button);

		frame.setSize(600, 300);
		frame.add(panel);

		// Converter
		String inputout = input.getText();

		StringBuilder r = new StringBuilder(inputout);

		for (int i = 0; i < r.length(); i++)
		{
			if (r.charAt(i) == 'e')
			{
				r.setCharAt(i, 3);
			}
		}

	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == this)
		{

		}
	}

}
