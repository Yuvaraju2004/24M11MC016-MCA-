import java.sql.*;
class InsertRecord
{
 public static void main(String args[]) 
{
 try 
{
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eswar", "root","Yuvaraju@@2004");
 Statement st = con.createStatement();
 st.executeUpdate("create table sai(sid int,sname varchar(20))");
  System.out.println("Record inserted successfully");
} 
catch(SQLException e)
{
System.out.println(e);
}
}
}
