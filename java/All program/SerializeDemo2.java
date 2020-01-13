import java.io.*;
class Dog implements Serializable
{
	transient int i=10;
	final transient int j=20;
}
class SerializeDemo2
{
	public static void main(String[] args) throws Exception
	{
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		System.out.println(d2.i+"-----"+d2.j);
	}
}