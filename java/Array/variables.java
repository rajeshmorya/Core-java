class variables
{
	int a=10;
	static int b=20;
	void add()
	{
		int c=30,d;
		d = (a+b+c);
	System.out.println("values"+d);
	}
	public static void main(String[] args)
	{
		variables s = new variables();
		s.add();
	}
}