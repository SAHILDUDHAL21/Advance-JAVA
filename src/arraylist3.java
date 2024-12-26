import java.util.ArrayList;

public class arraylist3
{
        public static void main(String[] args)
        {
                ArrayList al1=new ArrayList();
                al1.add(11);
                al1.add(44);
                al1.add(34);
                al1.add(12);
                al1.add(9);
                al1.add(87);
                al1.add(98);
                al1.add(87);
                al1.add(43);
                al1.add(46);
                al1.add(65);
                al1.add(76);
                al1.add(88);
                System.out.println(al1);
                if(al1.contains(87))
                {
                        System.out.println("87 is present in arraylist : ");
                }

                System.out.println("element at index 3: "+al1.get(3));

                System.out.println("first element : "+al1.getFirst());
                System.out.println("last element : "+al1.getLast());

                System.out.println("before  "+al1);
               //ArrayList ans= al1.sort();
                System.out.println("after reversed"+al1.reversed());
        }
}
