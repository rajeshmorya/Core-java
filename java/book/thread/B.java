class C extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}	
}
class B
{
	public static void main(String[] args)
	{
		C t1 = new C();
		t1.start();
		for(int i=1000;i<1010;i++)
		{
			System.out.println(i);
		}
	}
}