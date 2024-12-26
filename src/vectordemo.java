import java.util.Vector;

public class vectordemo
{
        public static void main(String[] args)
        {
                Vector v1=new Vector(5);

                v1.add(44);
                v1.add(55);
                v1.add(78);
                v1.add(88);
                System.out.println("Capacity : "+v1.capacity());
                v1.add(98);
                v1.add("hello");
                v1.add("how");
                v1.add("lk");
                System.out.println("Capacity : "+v1.capacity());
                // baki sara arraylist sarkha ch ahe


                System.out.println("clear function");
                v1.clear();
                System.out.println(v1);
        }
}
