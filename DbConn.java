package JDBC;
import java.sql.*;
public class DbConn {
	public static void main(String [] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Shalu7Selvaraj";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connected Successfully");
		con.close();
	}

}
