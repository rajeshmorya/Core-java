import java.util.*;
class E
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add("abc");
		list.add('s');
		list.add(true);
		list.add(234.59);
		System.out.println(list);
		list.add("xyz");
		System.out.println(list);
		list.add(2,"check");
		System.out.println(list);
	}
}