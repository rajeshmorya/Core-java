class Variables
{
	int val = 10;
	public static void main(String[] args)
	{
		Variables s = new Variables();
		s.val = 20;
		Variables s1 = new Variables();	
		System.out.println(s1.val);
	}
}