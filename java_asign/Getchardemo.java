class Getchardemo
{
	public static void main(String[] args)
	{
		String s = "this is a demo of the getchars method";
		int start =10;
		int end =14;
		char buf[] = new char[end-start];
		s.getChars(start,end,buf,0);
		System.out.println(buf);
	}
}