class staticblock
{
	
	static
	{
		System.out.println("this is static block");
	}
	
	staticblock()
	{
		System.out.println("this is constructor"+i);
	}
	static int i =20;
}
class Test5
{
	public static void main(String[] args)
	{
		staticblock s = new staticblock();
	}
}