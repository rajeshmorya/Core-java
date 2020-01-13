class Pyramid17
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{	
			for(int l=5;l>i;l--)
			{	
				System.out.print(" ");
			}
			int k=5;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k--;
			}
			int n = k;		
			for(int m=1;m<i;m++)
			{
				System.out.print(n+2);
				n++;
			}
			System.out.println();
		}
	}
}