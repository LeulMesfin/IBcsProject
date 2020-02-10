package donorTakerWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;

import donorChosen.donorC;
import recipientChosen.recipientC;

public class donorTaker {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					donorTaker window = new donorTaker();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public donorTaker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel dtLabel = new JLabel("Donor or Recipient");
		dtLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		dtLabel.setBounds(155, 31, 140, 23);
		frame.getContentPane().add(dtLabel);
		
		JRadioButton donorRadioBtn = new JRadioButton("Donor");
		donorRadioBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(donorRadioBtn == e.getSource())
				{
					donorC dChosen = new donorC();
					donorC.main(null);
				}
			
			}
				
		});
		
		donorRadioBtn.setFont(new Font("Arial", Font.PLAIN, 13));
		donorRadioBtn.setBounds(175, 103, 109, 23);
		frame.getContentPane().add(donorRadioBtn);
		
		JRadioButton recipRadioBtn = new JRadioButton("Recipient");
		recipRadioBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(recipRadioBtn == e.getSource())
				{
					recipientC taker = new recipientC();
					recipientC.main(null);
				}
			}
			
		});
		recipRadioBtn.setFont(new Font("Arial", Font.PLAIN, 13));
		recipRadioBtn.setBounds(175, 141, 109, 23);
		frame.getContentPane().add(recipRadioBtn);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(89, 65, 271, 2);
		frame.getContentPane().add(separator);
		
		JButton homeBtn3 = new JButton("Home");
		homeBtn3.setFont(new Font("Arial", Font.PLAIN, 13));
		homeBtn3.setBounds(175, 200, 89, 23);
		frame.getContentPane().add(homeBtn3);
	}
}
