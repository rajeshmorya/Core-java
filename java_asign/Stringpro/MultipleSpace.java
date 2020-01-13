class MultipleSpace
{
	public static void main(String[] args)
	{
		String s = new String("Hello,    my name   is  rajesh morya   .  ");
		String s1 = s.replaceAll("\\s+", " ");
		
		System.out.println(s1);
	}
}