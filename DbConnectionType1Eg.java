package JDBC;
import java.sql.*;
public class DbConnectionType1Eg {

	public static void main(String[] args) throws Exception{
		readRecords();
		insertRecord();
		insertVar();
		insertUsingPst();
		update();
		commitdemo();

	}
	public static void readRecords() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Shalu7Selvaraj";
		String query = "Select * from teacher";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			System.out.println("Id is : "+rs.getInt(1));
			System.out.println("Id is : "+rs.getString(2));
			System.out.println("Id is : "+rs.getString(3));
			System.out.println("Id is : "+rs.getInt(4));
		}
		con.close();
	}
	public static void insertRecord() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password ="Shalu7Selvaraj";
		String query = "insert into teacher values (103,'Priya','Python',35000)";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("Number of rows affected: "+rows);
		st.close();
		con.close();
	}
	public static void insertVar() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Shalu7Selvaraj";
		int t_id = 102;
		String t_name = "Diya";
		String t_sub = "HTML";
		int t_sal = 30000;
		String query ="insert into teacher values("+t_id+",'"+t_name+"','"+t_sub+"',"+t_sal+")";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("Number of rows affected: "+rows);
		con.close();
	}
	public static void insertUsingPst() throws Exception{
		String url ="jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Shalu7Selvaraj";
		int t_id = 104;
		String t_name = "Anu";
		String t_sub = "C++";
		int t_sal = 25000;
		String query = "insert into teacher values(?,?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, t_id);
		pst.setString(2, t_name);
		pst.setString(3, t_sub);
		pst.setInt(4, t_sal);
		int rows =pst.executeUpdate();
		System.out.println("Number of rows affected: "+rows);
		con.close();
	}
	public static void update() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Shalu7Selvaraj";
		String query = "update teacher set t_name ='John' where t_id =103";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("Number of rows affected: "+rows);
		con.close();
	}
	public static void commitdemo() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Shalu7Selvaraj";
		String query1= "update teacher set t_sal = 40000 where t_id =101";
		String query2 = "update teacher set t_sal = 45000 where t_id =103";
		Connection con = DriverManager.getConnection(url,username,password);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		int rows1 = st.executeUpdate(query1);
		System.out.println("Rows affected: " + rows1); 
		int rows2 = st.executeUpdate(query2); 
		System.out.println("Rows affected: " + rows2); 
		con.commit();        
	    con.close(); 
	}

}
