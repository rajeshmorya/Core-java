class Student1
{
	int roll;
	String name;
	Student1()
	{
		System.out.println("this is default constructor");
	}
	Student1(int roll,String name)
	{
		this();
		this.roll = roll;
		this.name = name;
	}
	public static void main(String[] args)
	{
		Student1 s1 = new Student1(145,"raj");
		System.out.println(s1.roll);
		System.out.println(s1.name);
		
	}
}