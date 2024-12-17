import java.sql.*;
import java.util.Scanner;

public class RSDemo
{
        public static void main(String[] args) throws Exception
        {
                Class.forName("org.postgresql.Driver");
                Connection con= DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
                Statement st=con.createStatement();
                Scanner sc=new Scanner(System.in);
                PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
                int ch;
                do{
                        System.out.println("1-insert \n 2-display \n 3-exit");
                        System.out.print("Enter Choice :: ");
                        ch=sc.nextInt();

                        switch (ch)
                        {
                                case 1 :System.out.print("\nEnter Employee Number ::");
                                        int eno= sc.nextInt();
                                        System.out.print("Enter Employee Name ::");
                                        String en= sc.next();
                                        System.out.print("1Enter Employee Salary ::");
                                        Float s= sc.nextFloat();
                                        pst.setInt(1,eno);
                                        pst.setString(2,en);
                                        pst.setFloat(3,s);
                                        int k=pst.executeUpdate();
                                        if(k>0)
                                                System.out.println("Record inserted.............");
                                        break;
                                case 2  :
                                        ResultSet rs=st.executeQuery("select * from emp");
                                        while(rs.next())
                                        {
                                                System.out.println("Employee Number => "+rs.getInt(1));
                                                System.out.println("Employee Name => "+rs.getString(2));
                                                System.out.println("Employee Salary => "+rs.getFloat(3));
                                        }
                                        rs.close();
                                        break;
                        }

                }while (ch<3);
                con.close();
                st.close();
                sc.close();
        }
}
