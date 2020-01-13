class FormatString
{
	public static void main(String[] args)
	{
		String s = new String("Hello rajesh");
		String s1 = String.format("I am %s",s);
		String s2 = String.format("My answer is %.8f", 47.65734);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}
}