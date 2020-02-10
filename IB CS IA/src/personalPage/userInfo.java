package personalPage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class userInfo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField uNameTf;
	private JTextField fNameTf;
	private JTextField lNameTf;
	private JTextField emailTf;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			userInfo dialog = new userInfo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public userInfo() {
		setBounds(100, 100, 650, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel uName = new JLabel("Username");
		uName.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		uName.setBounds(25, 143, 68, 14);
		contentPanel.add(uName);
		
		JLabel fName = new JLabel("First Name");
		fName.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		fName.setBounds(25, 168, 86, 14);
		contentPanel.add(fName);
		
		JLabel lName = new JLabel("Last Name");
		lName.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		lName.setBounds(25, 193, 86, 14);
		contentPanel.add(lName);
		
		JLabel contactLb = new JLabel("Contact Info");
		contactLb.setFont(new Font("Tahoma", Font.BOLD, 11));
		contactLb.setBounds(25, 286, 79, 14);
		contentPanel.add(contactLb);
		
		uNameTf = new JTextField();
		uNameTf.setBounds(142, 142, 86, 20);
		contentPanel.add(uNameTf);
		uNameTf.setColumns(10);
		
		fNameTf = new JTextField();
		fNameTf.setBounds(142, 167, 86, 20);
		contentPanel.add(fNameTf);
		fNameTf.setColumns(10);
		
		lNameTf = new JTextField();
		lNameTf.setBounds(142, 192, 86, 20);
		contentPanel.add(lNameTf);
		lNameTf.setColumns(10);
		
		JLabel nmeLabell = new JLabel("Name");
		nmeLabell.setFont(new Font("Tahoma", Font.BOLD, 11));
		nmeLabell.setBounds(25, 102, 46, 14);
		contentPanel.add(nmeLabell);
		
		JLabel emailLb = new JLabel("Email");
		emailLb.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		emailLb.setBounds(25, 330, 46, 14);
		contentPanel.add(emailLb);
		
		emailTf = new JTextField();
		emailTf.setBounds(142, 329, 86, 20);
		contentPanel.add(emailTf);
		emailTf.setColumns(10);
		
		JLabel addressLb = new JLabel("Address");
		addressLb.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		addressLb.setBounds(25, 355, 68, 14);
		contentPanel.add(addressLb);
		
		textField = new JTextField();
		textField.setBounds(142, 354, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		lblPhoneNumber.setBounds(25, 380, 107, 14);
		contentPanel.add(lblPhoneNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(142, 379, 86, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton registerBtn = new JButton("Register");
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		registerBtn.setBounds(287, 455, 89, 23);
		contentPanel.add(registerBtn);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRegister.setBounds(273, 37, 107, 34);
		contentPanel.add(lblRegister);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
