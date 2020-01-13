interface A1
{
	void test();
}
class A implements A1
{
	public void test()
	{
		System.out.println("the first implementation");
	}
	public static void main(String[] args)
	{
		A a = new A();
		//a.test();
	}
}
class B implements A1
{
	public void test()
	{
		System.out.println("the second implementation");
	}
	public static void main(String[] args)
	{
		A1 b = new A();
		b.test();
	}
}