class super2
{
	int a= 10;
	int b= 20;
}
class super1 extends super2
{
	int x = 50;
	int y = 60;
	void show()
	{
		System.out.println(a+x);	
		System.out.println(b+y);
	}
	public static void main(String[] args)
	{
		super1 sp = new super1();
		sp.show();
			
	}
}