class super4
{
	super4()
	{
		System.out.println("this is constructor of super4");
	}
	int x= 10;
	int y= 20;
}
class super3 extends super4
{
	int x;
	int y;
	super3(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	void display()
	{
		System.out.println(x+y);
		System.out.println(this.x+this.y);
		System.out.println(super.x+super.y);
	}
	public static void main(String[] args)
	{
		super3 sp3 = new super3(50,50);
		sp3.display();
	}
}