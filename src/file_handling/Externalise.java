import java.io.* ;
public class Externalise implements Externalizable
{
String s; 
int i; 
int j;
public Externalise ()
{
System.out.println("no-arg constructor");
}
public Externalise(String s, int i, int j) 
{
this.s= s; 
this.i =i ;
this.j= j; 
}
public void writeExternal(ObjectOutput os) throws IOException
{
os.writeObject(s);
os.writeInt(i);
}
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
{       
s =(String)in.readObject();
i = in.readInt();
}
public static void main(String args[])  throws Exception 
{
Externalise t1= new Externalise ("saloni",10,20);
FileOutputStream fos = new FileOutputStream("abc.ser");
ObjectOutputStream oos = new ObjectOutputStream(fos); 
oos.writeObject(t1);
FileInputStream fis = new FileInputStream("abc.ser");
ObjectInputStream ois = new ObjectInputStream(fis);
Externalise t2 = (Externalise)ois.readObject();
System.out.println(t2.s+"..."+t2.i+"..."+t2.j);
}
}