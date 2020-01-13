class A
{
	A get()
	{
		return this;
	}
	void msg()
	{
		System.out.println("hello java");
	}
}
class Test1
{
	public static void main(String[] args)
	{
		new A().get().msg();	
	}
}