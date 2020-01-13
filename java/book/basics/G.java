public class G
{
	public static void main(String[] args)
	{
		//System.out.println("I am in main method");
		E e = new E();
		test();
		E.test();
		e.test();

	}
	public static void test()
	{
		System.out.println("i am in test method12");
	}
}