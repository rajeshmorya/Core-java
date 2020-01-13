class M
{
	static class A extends Thread
	{
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(i);
			}
		}
	}		
	static class B implements Runnable
	{
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)
	{
		A a = new A();
		a.start();
		B b = new B();
		Thread t1 = new Thread(b);
		t1.start();
		for(int i=2000;i<2010;i++)
		{
			System.out.println(i);
		}
	}
}