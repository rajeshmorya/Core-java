class E
{
	public static void main(String[] args)
	{
		String s1 = "abc";
		String s2 = "xyz";
		String s3 = "abcxyz";
		String s5 = "abcxyz";
		String s6 = "abc"+s2;
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
	}
}