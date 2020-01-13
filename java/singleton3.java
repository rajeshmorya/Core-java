class singleton2
{
	private static singleton2 obj = null;
	private singleton2(){ }
	public static singleton2 getInstance()
	{
		if(obj == null)
		{
			obj = new singleton2();
		}
		return obj;
	}
}
class singleton3
{
	public static void main(String[] args)
	{
		singleton2 s = singleton2.getInstance();
		singleton2 s1 = singleton2.getInstance();
		System.out.println(s);
		System.out.println(s1);
	}
}