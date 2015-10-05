import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class spamalot
{
	JFrame frame;
	JPanel panel;
	JButton good;
	JButton bad;
	JTextField input;

	static final String FAKE_USERNAME = "sirspamalot99999@gmail.com";
	static final String FAKE_PASSWORD = "attack00";

	public static void main(String[] args)
	{
		spamalot r = new spamalot();
	}

	public spamalot()
	{
		// GUI
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();

		input = new JTextField(20);
		panel.add(input);

		good = new JButton("good");
		panel.add(good);

		bad = new JButton("bad");
		panel.add(bad);

		frame.add(panel);
		frame.pack();

		while (sendSpam(false))
		{
			myJTextField.setBackground(Color.RED);
		}
	}

	private boolean sendSpam(String recipient, String subject, String content)
	{

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator()
				{
					protected javax.mail.PasswordAuthentication getPasswordAuthentication()
					{
						return new javax.mail.PasswordAuthentication(
								FAKE_USERNAME, FAKE_PASSWORD);
					}
				});

		try
		{

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == this)
		{

		}
	}
}
