import java.util.*;
class K
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(90);
		list.add(19);
		list.add(81);
		list.add(80);
		list.add(18);
		list.add(83);
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(19);
		list1.add(20);
		list.add(18);	
		System.out.println(list);
		System.out.println(list1);
		System.out.println("----");
		list.retainAll(list1);
		System.out.println(list);
		System.out.println(list1);
	}

}