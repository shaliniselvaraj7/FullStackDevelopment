package JDBC;
import java.sql.*;
public class Type1Eg {
	public static void main(String [] args) throws Exception{
		readRecords();
		insertRecords();
		insertVar();
		insertUsingPst();
		update();
		commitdemo();
		
	}
	public static void readRecords() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password ="Shalu7Selvaraj";
		String query = "Select * from employee";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connected to DataBase Successfully");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			System.out.println("Id : "+rs.getInt(1));
			System.out.println("Name : "+rs.getString(2));
			System.out.println("Salary : "+rs.getInt(3));
			
		}
		con.close();
	}
	public static void insertRecords() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username ="root";
		String password ="Shalu7Selvaraj";
		String query ="insert into employee values (1,'Priya',100000)";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("Number of rows affected:"+rows);
		st.close();
		con.close();
	}
	public static void insertVar() throws Exception{
		String url= "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password ="Shalu7Selvaraj";
		int id = 2;
		String name = "Varun";
		int salary =250000;
		String query = "insert into employee values ("+ id + ", '"+ name + "', "+ salary + ")";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("Number of rows affected: "+rows);
		con.close();
		
	}
	public static void insertUsingPst() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password ="Shalu7Selvaraj";
		int id =5;
		String name ="Anu";
		int salary = 200000;
		String query="insert into employee values(?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setInt(3, salary);
		int rows = pst.executeUpdate();
		System.out.println("Number of rows affected:"+rows);
		con.close();
	}
	public static void update() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password ="Shalu7Selvaraj";
		String query ="update employee set salary = 159000 where id=5";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("Number of rows affected:"+rows);
		con.close();
	}
	public static void commitdemo() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Shalu7Selvaraj";
		String query1 = "update employee set salary = 40000 where id =2";
		String query2 = "update employee set salary =400000 where id = 1";
		Connection con = DriverManager.getConnection(url, username, password);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		int rows1 = st.executeUpdate(query1);
		System.out.println("Rows affected:"+rows1);
		int rows2 = st.executeUpdate(query2);
		System.out.println("Rows affected:"+rows2);
		con.commit();
		con.close();
	}

}
