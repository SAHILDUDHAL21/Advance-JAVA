import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RSDemo
{
        public static void main(String[] args) throws Exception
        {
                Class.forName("org.postgresql.Driver");
                Connection con= DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
                Statement st=con.createStatement();
        }
}
