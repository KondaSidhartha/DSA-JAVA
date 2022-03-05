import java.sql.*;
public class jdbc
{
    public static void main(String[] args) {
        try{
            //step 1: load the driver
             Class.forName("com.mysql.cj.jdbc.Driver");
//             step 2: create connection
             String url="jdbc:mysql://localhost:3306/JDBC";
             String userName="root";
             String password="";
             Connection con= DriverManager.getConnection(url,userName,password);
//             step 3: sql query to insert data in table
             String sql="INSERT INTO student(Studentname,Rollno,State)VALUES('Konda Sidhartha',2006222,'Telangana')";
//             step 4: create statement and process to execute query
             Statement stmt= con.createStatement();
             int row=stmt.executeUpdate(sql);
//             step 5: to print the affected row.
             System.out.println("no. of row added="+row);
             }
             catch(ClassNotFoundException e) {
             e.printStackTrace();
             }
             catch(SQLException e) {
             e.printStackTrace();
             }
             }
             }
