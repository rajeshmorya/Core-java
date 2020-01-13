class LinkedList1
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(2);
		list.add(9);
		System.out.println(list);
		Object obj = list.poll();
		System.out.println(obj);
		
	}

}