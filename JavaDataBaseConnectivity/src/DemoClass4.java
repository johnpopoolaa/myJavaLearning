// import package
import java.sql.*;

// this inserts a value into the database
public class DemoClass4 {
	public static void main(String[] args) throws Exception
	{
		// create predefined variables
		String url = "jdbc:mysql://localhost:3306/aliens"; // specify the url of the db
		String uname = "root"; // specify the username
		String pass = "#$@123John"; // password
		int userID = 5;
		String userName = "Usman";
		String query = "insert into students values (" + userID + ",'" + userName + "')"; // inserts values stored already
		
		// Class.forName("com.mysql.jdbc.Driver"); // register driver - after loading it into your project folder of course. this isn't necessary anymore when working with eclipse ide
		Connection con = DriverManager.getConnection(url, uname, pass); // establish connection
		Statement st = con.createStatement(); // create statement
		int count = st.executeUpdate(query); // execute query - we are using DML to insert values... hence executeUpdate
		
		// process the results
		
		
		System.out.println(count + " row(s) affected"); // print the result
		
		// close resources
		st.close(); // close statement
		con.close(); // close connection
	}
}
