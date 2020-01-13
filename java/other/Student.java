class Student
{
	int rollno;
	String name;
	Student(int rollno,String name)
	{
		
		this.rollno = rollno;
		this.name = name;
	}
	public static void main(String[] args)
	{
		Student s = new Student(123,"rajesh");
		System.out.println(s.rollno);
		System.out.println(s.name);
	}	
}