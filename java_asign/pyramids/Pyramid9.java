class Pyramid9
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			int k=6;
			for(int j=5;j>=i;j--)
			{
				k--;
				System.out.print(k);
			}
			System.out.println();
		}
	}
}