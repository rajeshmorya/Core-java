class ArrayDemo
{
	public static void main(String[] args)
	{
		System.out.println("Hello");		
		ArrayDemo.main("Hey");
		
	}
	public static void main(String args1)
	{
		System.out.println("new main method"+args1);
		ArrayDemo.main("hi","rajesh");
			
	}
	public static void main(String args2,String args3)
	{
		System.out.println(args2+" "+args3);
	}
}