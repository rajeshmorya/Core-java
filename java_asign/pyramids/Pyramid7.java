class Pyramid7
{
	public static void main(String[] args)
	{
		int k=6;
		for(int i=1;i<=5;i++)
		{	k--;
			for(int j=5;j>=i;j--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
} 