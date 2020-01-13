import java.util.*;
class Q
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add("list");
		list.add("123");
		list.add("ABc");
		System.out.println("123");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}