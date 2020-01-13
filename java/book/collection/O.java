import java.util.*;
class O
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
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Comparator ctr = Collections.reverseOrder();
		System.out.println(ctr);
		Collections.sort(list,ctr);
		System.out.println(list);
	}

}