import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{	
	JFrame frame;
	JPanel panel;
	JButton button;
	Date d;
	int moleCount = 0;
	
	public static void main(String[] args) {
		
		WhackAMole r = new WhackAMole();
	}

	public WhackAMole(){
		drawButtons(new Random().nextInt(23));
		d = new Date(System.currentTimeMillis());
	}
	
	public void drawButtons(int x){
		
		
		frame = new JFrame();
			frame.setVisible(true);
			frame.setSize(500, 175);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			
		panel = new JPanel();
			
			frame.add(panel);
		
		for (int i = 0; i < 24; i++){
			button = new JButton();
				button.addActionListener(this);
			panel.add(button);
				
			if(i == x){
				button.setText("Mole!");
			}
		}	

	}
	
	void speak(String words) {
		try 
		{
			Runtime.getRuntime().exec("say " + words).waitFor();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private void playSound(String fileName) 
	{
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is " + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	
	public void actionPerformed(ActionEvent e)
	{
		JButton j = (JButton)e.getSource();
		if(j.getText().equals("Mole!"))
		{
			moleCount += 1;
			playSound("moleHit.aiff");
			frame.dispose();
			drawButtons(new Random().nextInt(23));
			
			if(moleCount == 10){
				endGame(d, moleCount);
			}
		}
		else
		{
			speak("Dork");
		}
	}
}
