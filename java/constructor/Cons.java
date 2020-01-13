class Cons
{
	Cons()
	{
		System.out.println("this is default constructor");
	}
	Cons(int a)
	{	this();
		System.out.println("this is parameterized constructor");
	}
	Cons(int a,float b)
	{	this(50);
		System.out.println("this is two parameterized constructor");
	}
	public static void main(String[] args)
	{
		Cons c = new Cons(10,20.5f);
	}
}