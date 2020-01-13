class c1
{
	void test()
	{
		System.out.println("test method of c1 class");
	}
}
class c extends c1
{
	void test()
	{
		System.out.println("test method for c class");
	}
	void test1()
	{
		System.out.println("test1 method for c class");
	}
	public static void main(String[] args)
	{
		c1 v = new c();
		c1 v1 = new c1();
		v.test();
		v1.test();
	}
}