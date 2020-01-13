class Instanceblock2
{

	Instanceblock2()
	{
		System.out.println("this is constructor ");
	}
	
	//method();
	void method()
	{
		System.out.println("instance method");
		//return 10;
	}
	{
		System.out.println("instance block");
	}
}
class Test3
{
	public static void main(String[] args)
	{
		Instanceblock2 d = new Instanceblock2();	
	}
	
}