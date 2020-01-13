import java.util.*;
class A
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add("abc");
		list.add("90");
		list.add("80");
		System.out.println(list);
		System.out.println("-----------");
		System.out.println(list.get(0));
		System.out.println("-----------");
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
}