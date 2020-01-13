abstract class Abstest1
{
	void display()
	{
		System.out.println("hello display method");
	}	
	abstract void show();
}
class Abstest extends Abstest
{

	public static void main(String[] args)
	{
		Abstest a = new Abstest();
		a.display();
		a.show();
	}
	
}