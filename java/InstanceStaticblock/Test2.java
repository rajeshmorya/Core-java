class Instanceblock2
{

	Instanceblock2()
	{
		System.out.println("this is constructor "+m);
	}
	{
		System.out.println("instance block");
	}
	int m = method();
	int method()
	{
		System.out.println("instance method");
		return 10;
	}
	
}
class Test3
{
	public static void main(String[] args)
	{
		Instanceblock2 d = new Instanceblock2();	
	}
	
}