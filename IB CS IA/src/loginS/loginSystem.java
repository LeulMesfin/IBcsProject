package loginS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import donorTakerWindow.donorTaker;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class loginSystem {

	private JFrame frame;
	private JPasswordField passField;
	private JTextField userTf;
	static ArrayList<String> users = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginSystem window = new loginSystem();
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
	public loginSystem() {
		initialize();
	}
	
	public static ArrayList<String> getUserArray() //my arrayList getter
	{
		return users;
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//my GUI elements via design
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel loginTitle = new JLabel("Login screen");
		loginTitle.setFont(new Font("Arial", Font.PLAIN, 14));
		loginTitle.setHorizontalAlignment(SwingConstants.TRAILING);
		loginTitle.setBounds(247, 24, 86, 23);
		frame.getContentPane().add(loginTitle);
		
		JLabel userLabel = new JLabel("Username");
		userLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		userLabel.setBounds(170, 97, 67, 14);
		frame.getContentPane().add(userLabel);
		
		JLabel passLabel = new JLabel("Password");
		passLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		passLabel.setBounds(170, 150, 67, 14);
		frame.getContentPane().add(passLabel);
		
		passField = new JPasswordField();
		passField.setFont(new Font("Arial", Font.PLAIN, 11));
		passField.setBounds(247, 146, 135, 23);
		frame.getContentPane().add(passField);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String userName = userTf.getText();
				String passWord = passField.getText();
				
				if(userName.contains("Bradley Beal") && passWord.contains("Wiz50"))
				{
					userTf.setText(null);
					passField.setText(null);
					
					donorTaker open = new donorTaker(); //The following code will open the InternalJFrame dOrT class upon correct usrN and pass *This object NOT needed
					donorTaker.main(null); //can stand alone or open.main(null); w/ obj above
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Incorrect username or password!", "Try again", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		loginBtn.setFont(new Font("Arial", Font.PLAIN, 13));
		loginBtn.setBounds(393, 198, 89, 23);
		frame.getContentPane().add(loginBtn);
		
		JButton homeBtn1 = new JButton("Home");
		homeBtn1.setFont(new Font("Arial", Font.PLAIN, 13));
		homeBtn1.setBounds(115, 198, 89, 23);
		frame.getContentPane().add(homeBtn1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(115, 58, 367, 2);
		frame.getContentPane().add(separator);
		
		userTf = new JTextField();
		userTf.setFont(new Font("Arial", Font.PLAIN, 11));
		userTf.setBounds(247, 94, 135, 23);
		frame.getContentPane().add(userTf);
		userTf.setColumns(10);
	}
}
