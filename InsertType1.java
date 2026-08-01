package JDBC;
import java.sql.*;
public class InsertType1 {

	public static void main(String[] args) throws Exception{
		String url ="jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Shalu7Selvaraj";
		Connection con = DriverManager.getConnection(url, username, password);
		String query ="insert into employee values(3,'Abi',350000)";
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.println("Record Inserted Successfully");
		con.close();
	}

}
