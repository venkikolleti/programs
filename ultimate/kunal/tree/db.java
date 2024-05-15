import java.sql.*;
public class db {
    public static void main(String args[])throws ClassNotFoundException ,SQLException{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/venki","root","password");
    Statement st=conn.createStatement();
    ResultSet result=st.executeQuery("select * from ex");
    while(result.next()){
        System.out.println(result.getInt(1)+" "+result.getString(2));
    }
}
}
