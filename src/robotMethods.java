import org.jointheleague.graphical.robot.Robot;

public class robotMethods
{
	public static void main(String[] args)
	{

		robotMethods r = new robotMethods();
	}

	public robotMethods()
	{
		Robot dennis = new Robot();
		Robot olofmeister = new Robot(250, 250);
		dennis.penDown();
		olofmeister.penDown();
		dennis.setSpeed(10);

		drawShape(dennis, 60, 5);

	}

	public void drawShape(Robot robot, int sides, int length)
	{
		for (int i = 1; i <= sides; i++)
		{
			robot.move(length);
			robot.turn(360 / sides);
		}
	}

	public void square(Robot robot, int size, int turn)
	{
		for (int i = 0; i <= 3; i++)
		{
			robot.move(size);
			robot.turn(turn);
		}
	}

}
