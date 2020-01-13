class Splite
{
	public static void main(String[] args)
	{
		String s = new String("Hello - rajesh - morya");
		String[] s1 = s.split("-",2);
		for(int i=0;i<s1.length;i++)	
		{
			System.out.println(s1[i]);
		}
	}
}