package JDBC;
import java.sql.*;
public class SelectCom {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password ="Shalu7Selvaraj";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from employee");
		while (rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));		
		}
		con.close();
	}
}
