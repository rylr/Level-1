import javax.swing.JOptionPane;

public class StringFun
{
	public static void main(String[] args)
	{
		StringFun r = new StringFun();
	}

	public StringFun()
	{
		String name = JOptionPane
				.showInputDialog(null, "Write your name here.");

		for (int i = name.length() - 1; i >= 0; i--)
		{
			System.out.print(name.charAt(i));
		}

	}
}
