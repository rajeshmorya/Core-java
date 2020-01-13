class singleton
{
	private static singleton s = new singleton();
	private singleton(){ } 
	public static singleton getInstance()
	{
		return s;
	}
}
class singleton1
{
	public static void main(String[] args)
	{
		singleton s1 = singleton.getInstance();
		singleton s2 = singleton.getInstance();
		System.out.println(s1); 
		System.out.println(s2); 
	}
}