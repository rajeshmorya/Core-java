package p1;
public class A
{
	int def = 10;
	public int pub = 20;
	private int pri = 30;
	protected int pro = 40;
}
class D
{
	public static void main(String[] args)
	{
		A a = new A();
		System.out.println(a.def);
		System.out.println(a.pub);
		System.out.println(a.pro);	
	}
}
class E extends A
{

		public static void main(String[] args)
	{	
 E a = new E();
 System.out.println("default "+a.def);
 System.out.println("public "+a.pub);
 //System.out.println("Private "+a.pri);
 System.out.println("Protected "+a.pro);
}

}