class Overriding1
{
	void property()
	{
		System.out.println("this is your property");
	}
	void vehicle()
	{
		System.out.println("this is vehical");
	}
}
public class Overriding2 extends Overriding1
{
	void vehicle()
	{
		System.out.println("this is not vehicle");
	}
	void car()
	{
		System.out.println("this is car");
	}
	public static void main(String... args)
	{
		//Overriding2 o = new Overriding2();	
		//o.property();
		//o.vehicle();
		Overriding1 ov = new Overriding2();
		ov.car();
		ov.property();
		ov.vehicle();
	}
}