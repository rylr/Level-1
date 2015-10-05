import java.io.FileReader;

public class tylerReadFromFile
{
	public static void main(String[] args)
	{
		tylerReadFromFile r = new tylerReadFromFile();
	}

	public tylerReadFromFile()
	{
		try
		{
			FileReader fr = new FileReader("tyler.txt");

			int z = 0;

			while (z != -1)
			{
				z = fr.read();
				System.out.print((char) z);
			}

		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
