package jdbcdaodemo;
import java.sql.*;

public class JdbcDaoDemo {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        
        Student s2 = new Student();
        s2.rollno = 15;
        s2.sname = "Augustine";
        dao.connect();
//        dao.addStudent(s2);
        
        dao.removeStudent(12);
    }
}
    
class StudentDAO
{
    Connection con = null;
    public void connect()
    {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aliens", "root", "#$@123John"); // establish the connection
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public Student getStudent(int rollno)
    {
        try {
            String query = "select sname from student where rollno="+rollno; // store the query to run in a string
            Student s = new Student(); // create the object of the Student class
            s.rollno = rollno; // make the current rollno to be the rollno of the current student object
            Statement st = con.createStatement(); // use the connection object to create the statement
            ResultSet rs = st.executeQuery(query); // create the result set object and pass the query to it
            rs.next(); // move the pointer to the next element to point at the current element in the database
            String name = rs.getString(1); // pass the number of columns we will be getting from the database to getString and pass it to name string
            s.sname = name; // pass the data from name to sname from the student object
            return s; // return the a student datatype as specified earlier
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
    
    public void addStudent(Student s)
    {
        String query = "insert into student values (?,?)";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            pst.setInt(1, s.rollno);
            pst.setString(2, s.sname);
            pst.executeUpdate();
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public void removeStudent(int rollno)
    {
        String query = "delete from student where rollno = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, rollno);
            ps.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
    
class Student
{
    int rollno;
    String sname;
}