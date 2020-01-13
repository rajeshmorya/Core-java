class ArraySort
{
	public static void main(String[] args)
	{
		int[] arr = {10,90,50,70,20};
		System.out.println("unsorted array is");
		display(arr);
		System.out.println("sorted array is");
		sort(arr);
	}
	static void display(int[] n)
	{
		for(int i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
	}
	static void sort(int[] a)
	{	int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		display(a);
	}
}