import java.util.*;
class C
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add("abc");
		list.add('s');
		list.add(true);
		list.add(234.56);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
}