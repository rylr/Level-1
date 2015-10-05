import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class TypingTutor {
	JFrame frame;
	JPanel panel;
	
	public static void main(String[] args) {
		TypingTutor r = new TypingTutor();	
	}

	public TypingTutor(){
	
	//GUI
	frame = new JFrame("Type or Die");
	panel = new JPanel();
		frame.add(panel);
	
	char currentLetter;
	
	currentLetter = generateRandomLetter();
		
	System.out.print(currentLetter);
	}
	
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}



}


