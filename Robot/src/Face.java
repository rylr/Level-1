import javax.swing.JFrame;

import org.jointheleague.graphical.robot.Robot;

public class Face {
	JFrame frame;
	public static void main(String[] args) {
		
		Face r = new Face();
	}
	
	Face(){
		Robot tyler = new Robot();
		
		head(tyler);
		eyes(tyler);
		nose(tyler);
		mouth(tyler);
		pupil(tyler);
		
	}
	
	public void head(Robot a){
		a.setX(480);
		a.setY(540);
		a.setSpeed(10);
		a.penDown();
		
		for(int i = 0; i <= 360; i++){
			a.move(5);
			a.turn(1);
		}
	}
	
	public void eyes(Robot b){
		b.setX(600);
		b.setY(440);
		b.setSpeed(10);
		b.penDown();
		
		for(int i = 0; i <= 360; i++){
			b.move(1);
			b.turn(1);
		}
		
		b.setX(800);
		b.setY(440);
		
		for(int i = 0; i <= 360; i++){
			b.move(1);
			b.turn(1);
		}
	}

	public void nose(Robot c){
		c.setX(750);
		c.setY(540);
		c.setSpeed(10);
		c.penDown();
		c.setAngle(0);
		
		for(int i = 0; i <= 3; i++){
			c.turn(120);
			c.move(40);
		}
	}
	
	public void mouth(Robot d){
		d.setX(650);
		d.setY(640);
		d.setSpeed(10);
		d.penDown();
		d.setAngle(0);
		
		for(int i = 0; i <= 1; i++){
			d.turn(90);
			d.move(200);
			d.turn(90);
			d.move(60);
		}
		
		d.turn(90);
		d.move(60);
		
		for(int i = 0; i <= 4; i++){
			d.turn(90);
			d.move(40);
			d.turn(180);
		}
	}
	
	public void pupil(Robot e){
		e.setX(600);
		e.setY(440);
		e.setSpeed(10);
		e.penDown();
		
		for(int i = 0; i <= 360; i++){
			e.move(1);
			e.turn(1);
		}
		
		e.setX(800);
		e.setY(440);
		
		for(int i = 0; i <= 360; i++){
			e.move(1);
			e.turn(1);
		}
	}
}
