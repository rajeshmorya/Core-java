class pyramid5
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2 == 0)
				System.out.print(1);
				if((i+j)%2 !=0 )
				System.out.print(0);
			}
			System.out.println();
		}
	}
}