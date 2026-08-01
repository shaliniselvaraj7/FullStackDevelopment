package JDBC;
import java.sql.*;
public class Type2EgDelete {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Shalu7Selvaraj";
		Connection con = DriverManager.getConnection(url, username, password);
		String query = "delete from teacher where t_id = 103";
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.println("Record Deleted Successfully");
		con.close();
	}

}
