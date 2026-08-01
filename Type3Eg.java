package JDBC;
import java.sql.*;
import java.util.*;
public class Type3Eg {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Shalu7Selvaraj";
		Connection con = DriverManager.getConnection(url,username,password);
		con.setAutoCommit(false);
		System.out.println("Connection Success");
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		String createTable = "create table student ("+"name varchar(20),"+"address varchar(40),"+"city varchar(30))";
		st.executeUpdate(createTable);
		String insertFixed = "insert into student values ('Anu','Navalur','Chennai')";
		st.executeUpdate(insertFixed);
		System.out.println("Hardcode Data Inserted");
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Address:");
		String address = sc.nextLine();
		System.out.println("Enter City:");
		String city = sc.nextLine();
		String insertUser = "insert into student values (?,?,?)";
		PreparedStatement ps = con.prepareStatement(insertUser);
		ps.setString(1, name);
		ps.setString(2, address);
		ps.setString(3, city);
		ps.executeUpdate();
		System.out.println("User Data Inserted");
		String updateQuery = "update student set city ='bangalore' where name ='anu'";
		st.executeUpdate(updateQuery);
		System.out.println("Data Updated");
		String alterQuery = "alter table student add state varchar(30)";
		st.executeUpdate(alterQuery);
		System.out.println("New Column Added");
		con.commit();
		System.out.println("Transaction Committed");
		String deleteQuery = "delete from student where name ='abi'";
		st.executeUpdate(deleteQuery);
		System.out.println("One Row Deleted");
		ResultSet rs = st.executeQuery("Select * from student");
		System.out.println("\nFinal Table Records");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			
		}
		rs.close();
		ps.close();
		st.close();
		sc.close();
		con.close();
	}

}
