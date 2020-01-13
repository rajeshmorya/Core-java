package p1.p2.test;
class InstanceBlock1
{
	/*InstanceBlock()
	{
		System.out.println("instance block constructor");
	}
	{
		System.out.println("first instance block");
	}
	{
		System.out.println("second instance block");
	}*/
	int i=10;

}
class TestInstanceBlock
{
	public static void main(String[] args)
	{
		InstanceBlock1 i = new InstanceBlock1();	
		InstanceBlock1 i1 = new InstanceBlock1();
	}
}