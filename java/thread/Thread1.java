class Thread1
{	
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			//System.out.println("Good morning");
			/*try
			{
				Thread.sleep(1000);	
			}
			catch(InterruptedException e)
			{
				
			}*/
			System.out.println(name);
		}

	}
}
class MyThread extends Thread
{
	Thread1 t;
	String name;
	MyThread(Thread1 t,String name)
	{
		this.t = t;		
		this.name = name;
	}
	public void run()
	{
		t.wish(name);
	}	
}
class SynchronizedDemo
{
	public static void main(String[] args)
	{
		Thread1 t = new Thread1();
		MyThread t1 = new MyThread(t,"dhoni");
		MyThread t2 = new MyThread(t,"yuvraj");
		t1.start();
		t2.start();
	}
}