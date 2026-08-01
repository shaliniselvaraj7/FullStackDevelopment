package JDBC;
import java.sql.*;
public class Type2EgUpdate {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Shalu7Selvaraj";
		Connection con = DriverManager.getConnection(url, username, password);
		String query = "update teacher set t_sal = 50000 where t_id =101";
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.println("Record Updated Successfully");
		con.close();
	}

}
