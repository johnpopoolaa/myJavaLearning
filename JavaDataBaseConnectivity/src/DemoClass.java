import java.sql.*; // import package

// this prints one value(the specified one) in the database
public class DemoClass {
	public static void main(String[] args) throws Exception
	{
		// create predefined variables
		String url = "jdbc:mysql://localhost:3306/aliens"; // specify the url of the db
		String uname = "root"; // specify the username
		String pass = "#$@123John"; // password string - empty because we have no password
		String query = "select userName from students where userID = 2"; // store the query in a query sting so you do not have to manually input it
		
		// Class.forName("com.mysql.jdbc.Driver"); // register driver - after loading it into your project folder of course. this isn't necessary anymore when working with eclipse ide
		Connection con = DriverManager.getConnection(url, uname, pass); // establish connection
		Statement st = con.createStatement(); // create statement
		ResultSet rs = st.executeQuery(query); // execute query
		
		// process the results
		rs.next(); // move the pointer to the next element because it is initially at the element before the element we want to work on
		String name = rs.getString("userName"); // store the value we got in a string
		
		System.out.println(name); // print the result
		
		// close resources
		st.close(); // close statement
		con.close(); // close connection
	}
}
