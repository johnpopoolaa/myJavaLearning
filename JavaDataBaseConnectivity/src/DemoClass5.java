 // import package
import java.sql.*;

// this inserts a value into the database using a prepared statement
public class DemoClass5 {
	public static void main(String[] args) throws Exception
	{
		// create predefined variables
		String url = "jdbc:mysql://localhost:3306/aliens"; // specify the url of the db
		String uname = "root"; // specify the username
		String pass = "#$@123John"; // password
		int userID = 6;
		String userName = "David";
		String query = "insert into students values (?,?)"; // inserts values stored already
		
		// Class.forName("com.mysql.jdbc.Driver"); // register driver - after loading it into your project folder of course. this isn't necessary anymore when working with eclipse ide
		Connection con = DriverManager.getConnection(url, uname, pass); // establish connection
		
		// prepared statement block
		PreparedStatement st = con.prepareStatement(query); // create prepared statement
		st.setInt(1, userID);
		st.setString(2, userName);
		
		int count = st.executeUpdate(); // execute query - we are using DML to insert values... hence executeUpdate
		
		// process the results
		
		
		System.out.println(count + " row(s) affected"); // print the result
		
		// close resources
		st.close(); // close statement
		con.close(); // close connection
	}
}
