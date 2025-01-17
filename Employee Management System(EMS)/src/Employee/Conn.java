package Employee;

import java.sql.*;

public class Conn {
	
	Connection c;
	Statement s;
	
	public Conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ems", "root", "Che1062337010`");
			s = c.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
