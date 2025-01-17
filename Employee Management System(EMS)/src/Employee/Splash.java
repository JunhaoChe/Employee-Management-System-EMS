package Employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Splash extends JFrame implements ActionListener{
	
	Splash(){
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading = new JLabel("Employee Management System(EMS)");
		heading.setBounds(80, 30, 1200, 60);
		heading.setFont(new Font("serif", Font.PLAIN, 60));
		add(heading);
		
		JButton login = new JButton("Log in");
		login.setBounds(400, 400, 300, 70);
		login.addActionListener(this);
		add(login);
		
		setSize(1170, 650);
		setLocation(150, 50);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		new Login();
		
	}
	
	public static void main(String[] args) {
		new Splash();
	}
}