class Instanceblock1
{
	Instanceblock1()
	{
		System.out.println("this is constructor");
	}
	{
		System.out.println("instance block");
	}
}
class child1 extends Instanceblock1
{	
	child1()
	{
		System.out.println("this is child constructor");
	}
	{
		System.out.println("child instance block");
	}
}
class Test1
{
	public static void main(String[] args)
	{
		child1 d = new child1();	
	}
	
}