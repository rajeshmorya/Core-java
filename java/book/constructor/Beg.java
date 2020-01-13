class Beg
{
	int i;
	Beg()
	{
		System.out.println("this is default constructor");
	}
	Beg(int i)
	{
		System.out.println("this is parameterized constructor");
	}
	public static void main(String[] args)
	{
		Beg b= new Beg();
		Beg b1 = new Beg(10);
	}
}