package adminPage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminP extends JDialog 
{

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			adminP dialog = new adminP();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public adminP() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton viewList = new JButton("View List");
		viewList.setBounds(145, 40, 121, 43);
		getContentPane().add(viewList);
		
		JButton addPrsn = new JButton("Add Member");
		addPrsn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addPrsn.setBounds(145, 106, 121, 43);
		getContentPane().add(addPrsn);
		
		JButton dletePrsn = new JButton("Delete Member");
		dletePrsn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dletePrsn.setBounds(145, 167, 121, 43);
		getContentPane().add(dletePrsn);
		
		JButton logOff3 = new JButton("Log Off");
		logOff3.setBounds(335, 220, 89, 30);
		getContentPane().add(logOff3);
	}
}
