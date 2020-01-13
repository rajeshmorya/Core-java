class Instanceblock
{
	{
		System.out.println("first instance block");
	}
	{
		System.out.println("second instance block");
	}
	Instanceblock()	
	{
		System.out.println("this is constructor");
	}
}
class Test
{
	public static void main(String[] args)
	{
		Instanceblock b = new Instanceblock();
		
	}
}