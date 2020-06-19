package dbSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconcept {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driverUrl="com.mysql.jdbc.Driver";
		Class.forName(driverUrl).newInstance();
		
		String username="root";
		String url="jdbc:mysql://localhost:3306/sqldatabase";
		
		Connection con=DriverManager.getConnection(url, username, "");
		Statement stmnt=con.createStatement();
		ResultSet values=stmnt.executeQuery("select * from emptable");
		while(values.next()) {
			System.out.println(values.getString("empId")+"----"+values.getString("empName")+"----"+values.getString("empExp")+"---"+values.getString("empDept"));
			
			}
			
			}
		
		

	}


