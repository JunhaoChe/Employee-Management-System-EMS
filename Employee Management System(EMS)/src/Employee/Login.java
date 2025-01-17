package Employee;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
	
	JTextField tfusername, tfpassword;
	
	Login(){
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel username = new JLabel("Username: ");
		username.setBounds(70, 20, 100, 30);
		add(username);
		
		tfusername = new JTextField();
		tfusername.setBounds(180, 20, 150, 30);
		add(tfusername);
		
		JLabel password = new JLabel("Password: ");
		password.setBounds(70, 70, 100, 30);
		add(password);
		
		tfpassword = new JTextField();
		tfpassword.setBounds(180, 70, 150, 30);
		add(tfpassword);
		
		JButton login = new JButton("Log in");
		login.setBounds(160, 140, 150, 30);
		login.addActionListener(this);
		add(login);
		
		setSize(600, 300);
		setLocation(450, 200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		try {
			String username = tfusername.getText();
			String password = tfpassword.getText();
			
			Conn c = new Conn();
			String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
			ResultSet ra = c.s.executeQuery(query);
			if (ra.next()) {
				setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "invalid username or password");
				setVisible(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Login();
	}

}
