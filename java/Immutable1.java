public final class Immutable1
{	
	final String name;
	final int regNo;
	public Immutable1(String name,int regNo)
	{
		this.name = name;
		this.regNo = regNo;
	}
	public String getName()
	{
		return name;		
	}
	public int getRegNo()
	{
		return regNo;
	}
}
class Test
{
	public static void main(String[] args)
	{
		Immutable1 I = new Immutable1("ABC",101);
		System.out.println(I.getName());
		System.out.println(I.getRegNo());
	}
}