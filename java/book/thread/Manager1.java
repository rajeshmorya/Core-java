class Manager1
{
	public static void main(String[] args)
	{
		class A extends Thread
		{
		}
		A a = new A();
		System.out.println(a.getPriority());

		Thread t1 = Thread.currentThread();
		t1.setPriority(7);

		A a1 = new A();
		System.out.println(a1.getPriority());

		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(a1.getPriority());
	}
}