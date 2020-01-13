class Pyramid16
{
	public static void main(String[] args)
	{
		for(int i=1,l=1;i<=5;i++,l++)
		{
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");
			}
			int m=l;
			for(int j=1;j<=i;j++)
			{
				System.out.print(m);
				m++;
				
			}
			int o = m;
			for(int n=1;n<i;n++)
			{
				System.out.print(o-2);
				o--;	
			}
		System.out.println();

		}
	}
}