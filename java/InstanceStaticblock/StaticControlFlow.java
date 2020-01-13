class StaticControlFlow
{
	static int x =20;

	static  
	{
		
 		method();
 		System.out.println("First Static Block"); 
	}

	public static void main(String[] a)
	{
		method();
		System.out.println("Main Method");
	}

	
	public static void method() 
	{
 		System.out.println("y  " + y+""+i); 
	}

	static 
	{
  		System.out.println("Second Static Block");
	}
 	static int y = 200;
	static int i;
}
