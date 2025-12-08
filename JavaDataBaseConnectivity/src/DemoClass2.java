// import package
import java.sql.*;

// this prints all the values in the database
public class DemoClass2 {
	public static void main(String[] args) throws Exception
	{
		// create predefined variables
		String url = "jdbc:mysql://localhost:3306/aliens"; // specify the url of the db
		String uname = "root"; // specify the username
		String pass = "#$@123John"; // password string - empty because we have no password
		String query = "select * from students"; // store the query in a query sting so you do not have to manually input it
		
		// Class.forName("com.mysql.jdbc.Driver"); // register driver - after loading it into your project folder of course. this isn't necessary anymore when working with eclipse ide
		Connection con = DriverManager.getConnection(url, uname, pass); // establish connection
		Statement st = con.createStatement(); // create statement
		ResultSet rs = st.executeQuery(query); // execute query
		
		// process the results
		while(rs.next()) // move the pointer to the next element because it is initially at the element before the element we want to work on
		{	
			System.out.println(rs.getInt(1) + " : " + rs.getString(2)); // store the whole table in a string
		}
		
		// close resources
		st.close(); // close statement
		con.close(); // close connection
	}
}
