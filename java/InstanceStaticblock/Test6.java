class InsStatic
{
	{
		System.out.println("this is instance block");
	}
	static
	{
		System.out.println("this is static block");
	}
	InsStatic()
	{
		System.out.println("this is constructor");
	}
	{
		System.out.println("this is instance block1");
	}
	static
	{
		System.out.println("this is second static block");
	}
}
class Test6
{
	public static void main(String[] args)
	{
		InsStatic c = new InsStatic();
	}

}