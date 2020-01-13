import java.util.*;
class P
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(8);
		list.add(2);
		list.add(6);
		list.add(5);
		try
		{
			Collections.sort(list);
		}
		catch(ClassCastException e)
		{ 
			System.out.println("sorting can't be perform on diff data");
		}
		System.out.println(list);
	}
}