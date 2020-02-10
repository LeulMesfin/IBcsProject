package adminLoginSystem;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import adminPage.adminP;
import donorTakerWindow.donorTaker;

public class adminLogin 
{

	private JFrame frame;
	private JPasswordField passField2;
	private JTextField adminTf;
	static ArrayList<String> users = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminLogin window = new adminLogin();
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
	public adminLogin() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel adminTitle = new JLabel("Administration Log in");
		adminTitle.setFont(new Font("Arial", Font.PLAIN, 14));
		adminTitle.setHorizontalAlignment(SwingConstants.TRAILING);
		adminTitle.setBounds(211, 24, 149, 23);
		frame.getContentPane().add(adminTitle);
		
		JLabel adminLabel = new JLabel("Username");
		adminLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		adminLabel.setBounds(170, 97, 67, 14);
		frame.getContentPane().add(adminLabel);
		
		JLabel passLabel2 = new JLabel("Password");
		passLabel2.setFont(new Font("Arial", Font.PLAIN, 13));
		passLabel2.setBounds(170, 150, 67, 14);
		frame.getContentPane().add(passLabel2);
		
		JButton loginBtn2 = new JButton("Login");
		loginBtn2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String adminUser = adminTf.getText();
				String adminPass = passField2.getText();
				
				if(adminUser.contains("Admin") && adminPass.contains("e"))
				{
					adminTf.setText(null);
					passField2.setText(null);
					frame.setVisible(false);
					adminP go = new adminP();
					adminP.main(null);
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Incorrect username or password!", "Try again", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		loginBtn2.setFont(new Font("Arial", Font.PLAIN, 13));
		loginBtn2.setBounds(393, 198, 89, 23);
		frame.getContentPane().add(loginBtn2);
		
		passField2 = new JPasswordField();
		passField2.setFont(new Font("Arial", Font.PLAIN, 11));
		passField2.setBounds(247, 146, 135, 23);
		frame.getContentPane().add(passField2);
		
		JButton homeBtn1 = new JButton("Home");
		homeBtn1.setFont(new Font("Arial", Font.PLAIN, 13));
		homeBtn1.setBounds(102, 197, 89, 23);
		frame.getContentPane().add(homeBtn1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(115, 58, 367, 2);
		frame.getContentPane().add(separator);
		
		adminTf = new JTextField();
		adminTf.setFont(new Font("Arial", Font.PLAIN, 11));
		adminTf.setBounds(247, 94, 135, 23);
		frame.getContentPane().add(adminTf);
		adminTf.setColumns(10);
		
	}

}
