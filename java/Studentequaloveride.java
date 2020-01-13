class Studentequaloveride
{
	int sno;
	String name;
	Studentequaloveride(int sno,String name)
	{
		this.sno = sno;
		this.name = name;		
	}
	public boolean equals(Object o)
	{
		int SNO = this.sno;
		String NAME = this.name;
		System.out.println(SNO);
		Studentequaloveride s2 = (Studentequaloveride) o;
		int SNO1 = s2.sno;
		String NAME1 = s2.name;
		System.out.println(NAME1);
		if(SNO == SNO1 && NAME.equals(NAME1))
			return true;
		else
			return false;
		
	}
	public static void main(String[] args)
	{
		Studentequaloveride s = new Studentequaloveride(101,"rajesh");
		Studentequaloveride s1 = new Studentequaloveride(101,"rajesh");
		System.out.println(s.equals(s1));
	}

}