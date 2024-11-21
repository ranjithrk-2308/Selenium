package Task12;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class QuestionNumber02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String url = "jdbc:mysql://localhost:3306/employee";
	        String user = "root";
	        String password = "root";
	        Object[][] employeeData = {
		            {101, "Jenny", 30, 10000},
		            {102, "Jacky", 25, 20000},
		            {103, "Joe", 20, 30000},
		            {104, "John", 40, 40000},
		            {105, "Shameer", 25, 80000},
		            {106, "I", 30, 90000}
	        };
	        
	        try {
	        	System.out.println("Start");
				Connection connection = DriverManager.getConnection(url, user, password);

				if(connection!=null) {
					System.out.println("connection establish");
				}else {
					System.out.println("connection not establish");
				} 
				
		        String use ="use  Employee	";
		        String tab="CREATE TABLE Empl ( empcode INT PRIMARY KEY, empname VARCHAR(50), empage int , esalary int)";
		        
		        Statement state=connection.createStatement();
				state.execute(use);
				state.execute(tab);

	             
	             for (Object[] emp : employeeData) {
	            	 String sql = "INSERT INTO Empl (empcode, empname, empage, esalary) VALUES ("+emp[0]+", '"+emp[1]+"', "+emp[2]+", "+emp[3]+")";
	            	 state.execute(sql);
	            }

				System.out.println("Successfull");
			} 
	             catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Connection Failed");
			}
	        
	      finally {System.out.println("END");}
	        
	    }
	}


