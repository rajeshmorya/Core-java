class Immutable
{
	int i;
	Immutable(int i)
	{
		this.i = i;
	}
	Immutable modify(int j)
	{
		if(i==j)
		{
			return this;
		}
		else
		{
			return new Immutable(j);
		}
	}
	public static void main(String[] args)
	{
		Immutable m = new Immutable(20);
		Immutable m1 = m.modify(30);
		Immutable m2 = m.modify(20);
		System.out.println(m==m1);
		System.out.println(m==m2);	
		
	}
}