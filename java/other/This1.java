class Student
{
	int rollno;
	String name;
	Student(int rollno,String name)
	{
		rollno = rollno;
		name = name;
	}
	public static void main(String[] args)
	{
		Student s = new Student(123,"rajesh");
		System.out.println(s.rollno);
		System.out.println(s.name);
	}	
}