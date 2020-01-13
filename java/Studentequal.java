class Studentequal
{
	int sno;
	String name;
	Studentequal(int sno,String name)
	{
		this.sno = sno;
		this.name = name;
	}
	public static void main(String[] args)
	{
		Studentequal s = new Studentequal(101,"rajesh");
		Studentequal s1 = new Studentequal(101,"rajesh");
		
		//System.out.println(s == s1);	
		//System.out.println(s.equals(s1));
		//s = s1;
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		//System.out.println(s==s1);	
		//System.out.println(s.equals(s1));

		//System.out.println(s.equals(null));
		//System.out.println(null.equals(null));
		//s = null;
		//System.out.println(s.equals(s1));
		
		//System.out.println(s==null);

		Employe e = new Employe();	
		System.out.println(s.equals(e));
	}
}