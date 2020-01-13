class A1
{
	int i,j;
	String s;	
	double d;
	A1(double d)
	{
		i=10;
		j=20;
		s="hello";
		d=20.5;
		System.out.println("this is double constructor"+i);
	}
	A1(int i)
	{
		i=1000;
		j=2000;
		s="rajesh";
		d=30.25;                           		
		System.out.println("this is integer constructor");
	}
	A1()
	{
		System.out.println("this is default constructor");
	}
	public static void main(String[] args)
	{
		A1 a1 = new A1(200.6);
		A1 a2 = new A1();
		A1 a = new A1(100);
                	
		System.out.println(a2.i);
		System.out.println(a1.i);
		System.out.println(a.i);

	}
}