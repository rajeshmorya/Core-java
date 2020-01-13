interface B
{
	void test2();
	final double pi = 20.25;
}
class B1 implements B
{
	public void test2()
	{
		System.out.println("implementation B to method");
	}
	public void test1()
	{
		System.out.println("test1 method");
	}
	public static void main(String[] args)
	{
		B1 b = new B1();
		b.test2();
		b.test1();
	}
}