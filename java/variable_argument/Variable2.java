class Variable2
{
	void M(int n)
	{
		System.out.println("one parameter");
		System.out.println(n);
	}
	void M(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	void M(int... a)
	{
		System.out.println("Hello");
		System.out.println("Hey");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args)
	{
		byte b = 20;
		Variable2 v = new Variable2();
		v.M(10);
		v.M(10,20);
		//v.M(10,20,30,40);
		v.M();
		v.M(b);
	}
}