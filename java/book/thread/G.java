class G1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}	
}
class G
{
	public static void main(String[] args)
	{
		G1 g1 = new G1();
		g1.start();
	
		G1 g2 = new G1();
		g2.start();
	
		for(int i=1000;i<1010;i++)
		{
			System.out.println(i);
		}
	}

}