class Cons1
{
	Cons1(int a)
	{
		System.out.println("this is parent constructor");
	}
}
class Cons2 extends Cons1
{
	Cons2(float a)
	{
		super(20);
		System.out.println("this is child constructor");
	}
}
class TestCons
{
	public static void main(String[] args)
	{
		Cons2 t = new Cons2(30.8f);
		
	}

}