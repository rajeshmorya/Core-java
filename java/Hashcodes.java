class Hashcodes
{
	int sno;
	String name;
	Hashcodes(int sno, String name)
	{
		this.sno = sno;
		this.name = name;
	}
	public int hashCode()
	{
		return 100;
	}
	public static void main(String[] args)
	{
		Hashcodes s = new Hashcodes(101,"abc");
		Hashcodes s1 = new Hashcodes(102,"xyz");
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	System.out.println(Integer.toHexString(s.hashCode()));
	System.out.println(s);
	}
}