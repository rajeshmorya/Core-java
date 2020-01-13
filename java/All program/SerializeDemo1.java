import java.io.*;
class Dog implements Serializable
{
	int i=10;
	int j=20;
}
class SerializeDemo1
{
	public static void main(String[] args) throws Exception
	{
	Dog d1 = new Dog();
	System.out.println("serialization started");
	FileOutputStream fos = new FileOutputStream("abc.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(d1);
	System.out.println("serializable ended");
	System.out.println("Deserializable started");
	FileInputStream fis = new FileInputStream("abc.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Dog d2 = (Dog)ois.readObject();
	System.out.println("Deserialization ended");
	System.out.println(d2.i+"---------"+d2.j);
	}
}