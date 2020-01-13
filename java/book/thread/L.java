class L1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}
public class L
{
	public static void main(String[] args)
	{
		L1 i1 = new L1();
		i1.run();
		i1.start();
		for(int i=1000;i<1010;i++)
		{
			System.out.println(i);
		}
	}
}