class Tostringoverride
{
	int sno;
	String name;
	Tostringoverride(int sno, String name)
	{
		this.sno = sno;
		this.name = name;	
	}
	public String toString()
	{
		return "this is sno"+sno+"this is name"+name+"";
	}
	public static void main(String[] args)
	{
		Tostringoverride t = new Tostringoverride(102,"Ac");	
		System.out.println(t);			
	}
}
