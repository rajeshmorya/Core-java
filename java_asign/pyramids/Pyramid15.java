class Pyramid15
{
	public static void main(String[] args)
	{	int z=3;int k;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			for(int l=1;l<i;l++)
			{
				System.out.print(k);
				k++;

			}
			System.out.println(" ");
		}
	}
}