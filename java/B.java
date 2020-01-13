class A
{
    public static void display()
    {
        System.out.println("Inside static method of superclass");
    }
}

class B extends A
{
	public static void main(String[] args)
	{
		B b = new B();
		b.display();
	}
}