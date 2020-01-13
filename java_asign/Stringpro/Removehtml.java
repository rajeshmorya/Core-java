class Removehtml
{
	public static void main(String[] ags)
	{
		String s = new String("&lt;head&gt; bla bla</head>");
		String s1 = s.replaceAll("\\<.*?\\>", "");
		System.out.println(s1);
	}
}