class A12
{
	int i;
	String name;
	
	A12(String name)
	{
		this.name = name;
		
	}
	public String toString()
	{
		return name;
	}
	public static void main(String[] args)
	{
		A12 a = new A12("hello");
		A12 a1 = new A12("rajesh");
		System.out.println(a);
		System.out.println(a1);
	}
}