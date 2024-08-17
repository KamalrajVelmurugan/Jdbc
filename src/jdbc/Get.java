package jdbc;
import java.sql.*;
import java.io.*;
public class Get {
	//get method in java
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		String url="jdbc:mysql://localhost:3306/bank_details";
		String username="root";
		String password="One@123";
		String query = "select * from bank_details.bank_records";
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection(url, username, password);
		 System.out.println("Connection Established successfully");
		 Statement st = con.createStatement();
		  ResultSet rs = st.executeQuery(query); // Execute query
		  System.out.println("Bank"+" City"+" IFSCCODE");
      while(rs.next()) {
      String name= rs.getString("bank_name"); 
      String branch =rs.getString("branch");
      String ifsc= rs.getString("ifsc_code");

      System.out.println(name +" "+ branch+" "+ifsc);
    
      };// Print result on console
      st.close(); // close statement
      con.close(); // close connection
      System.out.println("Connection Closed....");
	}
}
