class Aeg
{
	Aeg()
	{
		System.out.println("this is default constructor");
	}
	Aeg(int a)
	{
		System.out.println("this is one parameter constructor");
	}
	Aeg(int a,String b)
	{
		System.out.println("this is two parameter constructor");
	}
	Aeg(int i,int j)
	{
		System.out.println("this is two parameter int type");
	}
	public static void main(String[] args)
	{
		Aeg a = new Aeg();
		Aeg b = new Aeg(10);
		Aeg c = new Aeg(20,"rajesh");
		Aeg d = new Aeg(60,80);
	}
}