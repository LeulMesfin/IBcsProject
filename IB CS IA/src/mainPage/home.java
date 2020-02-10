package mainPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import adminLoginSystem.adminLogin;
import loginS.loginSystem;
import personalPage.userInfo;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel homeTitle = new JLabel("The Church Helper");
		homeTitle.setFont(new Font("Sitka Banner", Font.BOLD, 16));
		homeTitle.setBounds(151, 29, 137, 23);
		contentPane.add(homeTitle);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(login == e.getSource())
				{
					loginSystem logon = new loginSystem();
					loginSystem.main(null);
					
				}
				
			}
		});
		login.setFont(new Font("Arial", Font.PLAIN, 11));
		login.setBounds(155, 105, 122, 23);
		contentPane.add(login);
		
		JButton register = new JButton("Register");
		register.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(register == e.getSource())
				{
					userInfo reg = new userInfo();
					userInfo.main(null);
				}
			}
		});
		register.setFont(new Font("Arial", Font.PLAIN, 11));
		register.setBounds(155, 139, 122, 23);
		contentPane.add(register);
		
		JButton admin = new JButton("Admin");
		admin.setFont(new Font("Arial", Font.PLAIN, 11));
		admin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(admin == e.getSource()) 
				{
					adminLogin aLog = new adminLogin();
					adminLogin.main(null);
				}
			}
		});
		admin.setBounds(155, 173, 122, 23);
		contentPane.add(admin);
	}
}
