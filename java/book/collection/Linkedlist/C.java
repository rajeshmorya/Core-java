import java.util.*;
class C
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(123);
		list.add("asd");
		list.add(12);
		list.add(10);
		list.add(23);
		list.add(89.98);
		list.add(100);
		list.add(231);
		list.add(890);
		System.out.println(list);
		System.out.println(list.remove(1));
		System.out.println(list);
		System.out.println(list.remove(4));
		System.out.println(list);
		System.out.println(list.remove());
		System.out.println(list);
		System.out.println(list.removeFirst());
		System.out.println(list);
		System.out.println(list.removeLast());
		System.out.println(list);
	}
}