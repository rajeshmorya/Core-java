class String12
{
	public static void main(String[] args)
	{
		 StringBuffer sb= new StringBuffer("Hello");
		String s1 = new String("Hello");
		System.out.println(sb);
		System.out.println(s1);

		System.out.println(s1.equals(sb.toString()));
	}
}