import java.util.*;
class CollectionsPrac
{
public static void main(String args[]) 
{
ArrayList l = new ArrayList();
l.add("a");
l.add(10);
l.add("A");
l.add(null);
System.out.println(l);
l.remove(2);
System.out.println(l);
l.add(2,"M");
l.add("N");
System.out.println(l);

LinkedList ll = new LinkedList ();
ll.add("d");
ll.add(30);
ll.add(null);
ll.add("d");
ll.add(0,"v");
ll.addFirst("c");
ll.removeLast();
System.out.println(ll);

LinkedList l2 = new LinkedList();
l2.add("Saloni");
l2.add("Priyanka");
l2.add("Aditi");
l2.add("Muskan");
System.out.println(l2);
ListIterator ltr = l2.listIterator();
while(ltr.hasNext())
{
String s=(String)ltr.next();
if(s.equals("saloni"))
{
ltr.remove();
}
else if(s.equals("aditi"))
{
ltr.add("raksha");
}
else if(s.equals("muskan"))
{
ltr.set("nss");
}
}
System.out.println(l2);
}
}