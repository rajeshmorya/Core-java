import java.util.*;
class A1
{
	int i;
	A1(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i="+i;
	}
}
public class R
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add(90);
		list.add(new A1(110));
		list.add(new A1(120));
		System.out.println(list);
	}
}