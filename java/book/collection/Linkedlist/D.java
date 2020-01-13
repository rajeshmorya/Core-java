import java.util.*;
//class Queue
class Stack
{
	private LinkedList list = new LinkedList();
	public void add(Object obj)
	{
		list.add(obj);
	}
	public Object processElement()
	{
		//return list.removeFirst();
		return list.removeLast();
	}
	public String toString()
	{
		return list.toString();
	}
}
class D
{
	public static void main(String[] args)
	{
		/*Queue q1 = new Queue();
		q1.add("abc");
		q1.add(22);
		q1.add(33);
		q1.add(90);
		q1.add(23);
		q1.add(89);
		System.out.println(q1);
		Object o1 = q1.processElement();
		System.out.println("-----------");
		System.out.println(o1);
		o1 = q1.processElement();
		System.out.println("-----------");
		System.out.println(o1);
		System.out.println(q1);*/

		Stack s1 = new Stack();
		s1.add("abc");
		s1.add(12);
		s1.add(900);
		s1.add("xyz");
		System.out.println(s1);
		System.out.println(s1.processElement());
		System.out.println(s1);
		System.out.println(s1.processElement());
		System.out.println(s1);
		System.out.println(s1.processElement());
		System.out.println(s1);
	}
}