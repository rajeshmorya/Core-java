import java.util.*;
class B
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(52);
		list.add(20);
		list.add(30);
		list.add(90);
		list.add(345);
		list.add(98);
		System.out.println("------");
		System.out.println(list);

		/*Collections.sort(list);
		System.out.println(list);
		System.out.println("------");*/

		Object obj = list.poll();
		System.out.println(obj);
		System.out.println(list.poll());
		System.out.println(list);

		System.out.println("------");
		obj = list.peek();
		System.out.println(obj);
		System.out.println(list.peek());
		System.out.println(list);
	}
} 