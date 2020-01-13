class demo
{
	public static void main(String[] args)
	{	int x1=4;
		for(int i=0;i<=3;i++)
		{
			for(int n=3;n>i;n--)
			{
				System.out.print(" ");
			}
			for(int o=5-x1;o>=1;o++)
			{
				System.out.print("*");
			}
			System.out.println();
			x1=x1-1;

			/*for(int j=3;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			
			for(int l=0;l<=i-1;l++)
			{
				System.out.print("*");
			}
			System.out.println();*/
		}
		int x=1;
		for(int m=0;m<=3;m++)
		{	
			for(int n=0;n<=m;n++)
			{
				System.out.print(" ");
			}
			for(int o=5-x;o>=m;o--)
			{
				System.out.print("*");
			}
			System.out.println();
			x++;
			
		}
	}	
}