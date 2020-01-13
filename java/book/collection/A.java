import java.util.*;
class A
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);		
		list.add("abc");
		list.add('s');
		list.add(true);
		list.add(234.54);
		list.add(null);
		System.out.println(list);
	}
}