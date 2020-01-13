class F1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}	
}
class F
{
	public static void main(String[] args)
	{
		F1 f=new F1();
		Thread t1 = new Thread(f);
		t1.start();
		for(int i=1000;i<1010;i++)
		{
			System.out.println(i);
		}
	}
}