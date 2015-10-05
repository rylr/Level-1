import javax.swing.JOptionPane;

public class StringFun2
{
	public static void main(String[] args)
	{
		StringFun2 r = new StringFun2();
	}

	public StringFun2()
	{
		String name = JOptionPane
				.showInputDialog(null, "Write your name here.");

		StringBuilder nme = new StringBuilder(name);

		/*
		 * for (int i = name.length() - 1; i >= 0; i--) {
		 * JOptionPane.showMessageDialog(null, "" + name.charAt(i)); }
		 */

	}
}
