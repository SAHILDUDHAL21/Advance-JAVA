import java.util.ArrayList;

public class Arraylist2
{
        public static void main(String[] args)
        {
                boolean b;
                ArrayList al=new ArrayList(5);
                al.add(11);
                al.add(44);
                al.add('h');
                al.add(1,"altered");
                System.out.println("remove by index :"+al.remove(0));
               // System.out.println("Remove by value : "+al.remove(44);
                // cant reomve by index by driectly printn
                b= (boolean) al.remove("44");// nahi chalatr bc
               System.out.println(al);

                System.out.println("clear function");
                al.clear();
                System.out.println(al);
        }
}
