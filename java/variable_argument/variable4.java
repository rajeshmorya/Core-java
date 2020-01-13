class variable4
{
	int sum(int... n)
	{	int sum1 =0;
		for(int n1 : n)	
		{
			sum1 = sum1+n1;
		}
		return sum1;
	}
	public static void main(String[] args)
	{	
		variable4  v = new variable4();
		int n = v.sum(1,2);
		System.out.println("the value is "+n);
		int n1 = v.sum(1,2,3,4,5);
		System.out.println("the second value is"+n1);
		int[] arr = {1,2,4,5,6,7};
		int n2 = v.sum(arr);
		System.out.println("the value is are "+n2);
		
	}
}