import java.util.LinkedList;

public class LinkListDemo
{
        public static void main(String[] args)
        {
                LinkedList l1=new LinkedList();
                 l1.addFirst(21);
                 l1.addLast(44);
                l1.addFirst(54);
                l1.add(55);

                l1.addFirst(634);
                l1.addFirst(65);
                l1.addFirst(46);
                l1.addFirst(282);
                l1.addFirst(91);
                System.out.println(l1);
                System.out.println("After removing first");
                l1.removeFirst();
                System.out.println(l1);
                l1.removeLast();
                System.out.println("After removing lAST");
                System.out.println(l1);
                l1.addFirst(44);
                l1.addLast(55);
                l1.addLast(55);
                l1.addFirst(55);
                l1.addLast(44);
                System.out.println("ADDING SOME MORE ELEMENT");
                System.out.println(l1);
                System.out.println("removing first occurance of 44");
                l1.removeFirstOccurrence(44);
                System.out.println(l1);
                l1.removeLastOccurrence(55);
                System.out.println("removing last occurance of 55");
                System.out.println(l1);

                System.out.println("clear function");
                l1.clear();
                System.out.println(l1);


        }
}
