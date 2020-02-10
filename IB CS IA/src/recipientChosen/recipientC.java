package recipientChosen;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import loginS.loginSystem;

public class recipientC extends JDialog 
{
	static String recGoods;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			recipientC dialog = new recipientC();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void receivePane()
	{
		recGoods = JOptionPane.showInputDialog("Number of Goods taken");

	}
	
	static void datePane2() //User can input date they donated goods 
	{
		String dateInput2 = JOptionPane.showInputDialog("Enter the date (MM/DD/YYYY)");
		System.out.println(dateInput2);
		DateFormat outputFormat2 = new SimpleDateFormat("MM/dd/yyyy");
		
		try {
				System.out.println(recGoods);
				FileWriter fw = new FileWriter("OptionPane.txt", true);
				fw.write(" " + recGoods + " ");
				fw.write(recGoods);
				fw.close();
				
				ArrayList<String> users = loginSystem.getUserArray();
				users.removeAll(users);
				Scanner s = new Scanner("loginUsers2.txt");
				while(s.hasNext())
				{
					users.add(s.next());
				}
				s.close();
				System.out.println(users);
				
				
		} catch(Exception e) {
			System.out.println("Error in recipientC");
		}
	}

	/**
	 * Create the dialog.
	 */
	public recipientC() 
	{
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		JLabel thnx = new JLabel("Thank You");
		thnx.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		thnx.setBounds(190, 64, 65, 14);
		thnx.setVisible(false);
		getContentPane().add(thnx);
		
		
		JLabel logOut2 = new JLabel("Please Log Off");
		logOut2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		logOut2.setBounds(185, 89, 82, 14);
		logOut2.setVisible(false);
		getContentPane().add(logOut2);
		
		JButton logOffBtn = new JButton("Log Off");
		logOffBtn.setBounds(318, 211, 82, 28);
		getContentPane().add(logOffBtn);
		
		JButton click = new JButton("Click");
		click.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(click == e.getSource())
				{
					click.setVisible(false);
					receivePane();
					datePane2();
					thnx.setVisible(true);
					logOut2.setVisible(true);
				}
			}
		});
		click.setBounds(178, 114, 89, 36);
		getContentPane().add(click);
	}
		
		
		
}

