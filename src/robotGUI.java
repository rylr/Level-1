import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jointheleague.graphical.robot.Robot;

public class robotGUI
{
	JFrame frame;
	JPanel panel;
	JTextField sides;
	JTextField sideLength;
	JTextField penSize;
	JTextField penColor;
	JTextField speed;
	JButton generate;
	JLabel sidesLab;
	JLabel sidesLengthLab;
	JLabel penSizeLab;
	JLabel penColorLab;
	JLabel speedLab;

	public static void main(String[] args)
	{
		robotGUI r = new robotGUI();

	}

	public robotGUI()
	{
		Robot dennis = new Robot();

		// UI
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);

		JButton generate = new JButton("Generate");
		generate.setBounds(10, 260, 150, 20);

		// Sides
		JTextField sides = new JTextField("", 20);
		sides.setBounds(100, 10, 150, 20);
		String sidesAns = sides.getText();

		// Side Length
		JTextField sideLength = new JTextField("", 20);
		sideLength.setBounds(100, 60, 150, 20);
		String sideLengthAns = sideLength.getText();

		// Pen Size
		JTextField penSize = new JTextField("", 20);
		penSize.setBounds(100, 110, 150, 20);
		String penSizeAns = penSize.getText();

		// Pen Color
		JTextField penColor = new JTextField("", 20);
		penColor.setBounds(100, 160, 150, 20);
		String penColorAns = penColor.getText();

		// Speed
		JTextField speed = new JTextField("", 20);
		speed.setBounds(100, 210, 150, 20);
		String speedAns = speed.getText();
		dennis.setSpeed(Integer.parseInt(speedAns));

		JLabel sidesLab = new JLabel("Sides");
		sidesLab.setBounds(5, 10, 150, 20);

		JLabel sidesLengthLab = new JLabel("Sides Length");
		sidesLengthLab.setBounds(5, 60, 150, 20);

		JLabel penSizeLab = new JLabel("Pen Size");
		penSizeLab.setBounds(5, 110, 150, 20);

		JLabel penColorLab = new JLabel("Pen Color");
		penColorLab.setBounds(5, 160, 150, 20);

		JLabel speedLab = new JLabel("Speed");
		speedLab.setBounds(5, 210, 150, 20);

		panel.add(sides);
		panel.add(sideLength);
		panel.add(penSize);
		panel.add(penColor);
		panel.add(speed);
		panel.add(generate);
		panel.add(sidesLab);
		panel.add(sidesLengthLab);
		panel.add(penSizeLab);
		panel.add(penColorLab);
		panel.add(speedLab);

		frame.add(panel);

		frame.setSize(300, 320);
	}
}
