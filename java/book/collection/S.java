import java.util.*;
class B1 implements Comparable
{
	int i;
	B1(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i="+i;
	}
	public int compareTo(Object Obj)
	{
		B1 b = (B1)Obj;
		return b.i-i;
	}
}
class S
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();		
		list.add(new B1(10));
		list.add(new B1(50));
		list.add(new B1(30));
		list.add(new B1(40));
		list.add(new B1(20));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}