package jdbc;
import java.sql.*;
import java.util.Scanner;

public class PostEmployee {
	//post method in java 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="One@123";
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Name :");
		String name =s.next();
		
		System.out.println("Enter a Age : ");
		int age =s.nextInt();
		
		System.out.println("Enter a Gender : ");
		String gender = s.next();
		
		String sql = "insert into employee.employeedetails(name,age,gender) values('"+name+"','"+age+"','"+gender+"')";
		Connection con =null;
		try {
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url,username,password);
			 
			  // Creating a statement
	            Statement st = con.createStatement();
	 
	            // Executing query
	            int m = st.executeUpdate(sql);
	            if (m == 1)
	                System.out.println("inserted successfully : " + sql);
	            else
	                System.out.println("insertion failed");
	 
	            // Closing the connections
	            con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
