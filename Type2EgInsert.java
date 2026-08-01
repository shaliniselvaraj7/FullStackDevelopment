package JDBC;
import java.sql.*;
public class Type2EgInsert {
	public static void main(String [] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Shalu7Selvaraj";
		Connection con = DriverManager.getConnection(url, username, password);
		String query = "insert into teacher values(105,'Abi','PHP',30000)";
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.println("Record inserted Successfully");
		con.close();
	}

}
