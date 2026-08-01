package JDBC;
import java.sql.*;
public class UpdateCom {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password ="Shalu7Selvaraj";
		Connection con = DriverManager.getConnection(url, username, password);
		String query = "update employee set salary = 250000 where id =2";
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.println("Record Updated Successfully");
		con.close();
	}

}
