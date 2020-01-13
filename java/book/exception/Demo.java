class Demo
{
	public static void main(String[] args)
	{
		m1();
	}
	static void m1(){
	int i=5,j=0;
		try{
		int k = i/j;
		}catch(Exception e)
		{
			System.out.println("new exception");
		}
	}
}