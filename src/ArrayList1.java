import java.util.ArrayList;

public class ArrayList1
{
        public static void main(String[] args)
        {
                ArrayList al=new ArrayList();

                System.out.println("Size : "+al.size());
                System.out.println("Check Empty : "+al.isEmpty());
                System.out.println("Count Total Elements : "+al.stream().count());
                al.add(11);
                al.add(44); //number add karu shakto
               // float f=new Float(4.6);
                al.add(33.6f); // pointed value pn add karu shakto
                // ata string
                al.add("chala ja bhos***ke");

                System.out.println("Count Total Elements : "+al.stream().count());
                System.out.println(al);

                al.add(1,"hello");


                System.out.println(al);
        }
}
