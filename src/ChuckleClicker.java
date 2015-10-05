import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker
{
	JFrame frame;
	JPanel panel;
	JButton joke;
	JButton punchline;

	public static void main(String[] args)
	{
		ChuckleClicker r = new ChuckleClicker();
	}

	public ChuckleClicker()
	{

	}

	public void makeButtons()
	{
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		joke = new JButton("Joke");
		punchline = new JButton("Punchline");
	}
}
