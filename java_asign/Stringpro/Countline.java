class Countline
{
	public static int getLineCount(String text)
	{ 
        	return text.split("[\n|\r]").length;
    	}
	public static void main(String[] args)
	{
		String str = "line1\nline2\nline3\nline4";
        	System.out.println(str);
		int count = getLineCount(str);
        	System.out.println("line count: "+count);
	}
}