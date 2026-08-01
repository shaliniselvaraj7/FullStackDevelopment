package JDBC;
import java.sql.*;
import java.util.*;
public class DbConnType3Eg {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Shalu7Selvaraj";
		Connection con = DriverManager.getConnection(url, username, password);
		con.setAutoCommit(false);
		System.out.println("Connection Success");
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		String createTab = "create table patient(p_id int,p_name varchar(20), p_add varchar(20))";
		st.executeUpdate(createTab);
		System.out.println("Table Created");
		String insertFix = "insert into patient values (101,'Kala','Chennai')";
		st.executeUpdate(insertFix);
		System.out.println("Enter name: ");
		String p_name = sc.nextLine();
		System.out.println("Enter Address: ");
		String p_add= sc.nextLine();
		System.out.println("enter id: ");
		int p_id = sc.nextInt();
		String insertUser = "insert into patient values (?,?,?)";
		PreparedStatement ps = con.prepareStatement(insertUser);
		ps.setInt(1, p_id);
		ps.setString(2, p_name);
		ps.setString(3, p_add);
		ps.executeUpdate();
		System.out.println("User Data Inserted");
		String updateQuery = "update patient set p_add='Chengalpat' where p_id=1";
		st.executeUpdate(updateQuery);
		System.out.println("Record Updated Successfully");
		String alterQuery = "alter table patient add p_phn int";
		st.executeUpdate(alterQuery);
		System.out.println("New Record Altered");
		String deleteQuery = "delete from patient where p_id = 101";
		st.executeUpdate(deleteQuery);
		System.out.println("One Row Deleted");
		con.commit();
		System.out.println("Transaction Committed");
		ResultSet rs = st.executeQuery("select * from patient");
		System.out.println("\nFinal Table Data:");
		while(rs.next()) {
			System.out.println( rs.getInt(1) + " " +rs.getString(2) + " "+rs.getString(3) + " " +rs.getInt(4));                   		
		}
		rs.close();
		ps.close();
		st.close();
		sc.close();
		con.close();
			
	}
	

}
