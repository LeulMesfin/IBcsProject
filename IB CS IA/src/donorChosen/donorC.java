package donorChosen;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import loginS.loginSystem;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class donorC extends JDialog implements ActionListener
{
	static String userG;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		try {
			donorC dialog = new donorC();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * Create the dialog.
	 */
	public donorC() 
	{
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel thnxLb = new JLabel("Thank You");
		thnxLb.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		thnxLb.setBounds(190, 64, 65, 14);
		thnxLb.setVisible(false);
		getContentPane().add(thnxLb);
		
		
		JLabel logOut = new JLabel("Please Log Off");
		logOut.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		logOut.setBounds(185, 89, 82, 14);
		logOut.setVisible(false);
		getContentPane().add(logOut);
		
		JButton btnLogOff = new JButton("Log Off");
		btnLogOff.setBounds(318, 211, 82, 28);
		getContentPane().add(btnLogOff);
		
		JButton clickMe = new JButton("Click");
		clickMe.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(clickMe == e.getSource())
				{
					clickMe.setVisible(false);
					goodsPane();
					datePane();
					thnxLb.setVisible(true);
					logOut.setVisible(true);
				}
			}
		});
		clickMe.setBounds(178, 114, 89, 36);
		getContentPane().add(clickMe);
	}
	
	static void goodsPane()
	{
		userG = JOptionPane.showInputDialog("Number of donations");

	}
	
	static void datePane() //User can input date they donated goods 
	{
		String inputG = JOptionPane.showInputDialog("Enter the date (MM/DD/YYYY)");
		System.out.println(inputG);
		DateFormat outputFormat = new SimpleDateFormat("MM/dd/yyyy");
		
		try {
				System.out.println(userG);
				FileWriter fw = new FileWriter("OptionPane.txt", true);
				fw.write(" " + userG + " ");
				fw.write(inputG);
				fw.close();
				
				ArrayList<String> users = loginSystem.getUserArray();
				users.removeAll(users);
				Scanner s = new Scanner("loginUsers.txt");
				while(s.hasNext())
				{
					users.add(s.next());
				}
				s.close();
				System.out.println(users);
				
				
		} catch(Exception e) {
			System.out.println("Error!");
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
}
