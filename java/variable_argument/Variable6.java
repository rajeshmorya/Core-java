class Variable6
{ 
	/*static void go(long x, long y) 
	{ 
		System.out.println("long,long");
	}*/
	static void go(byte...x) 
	{ 
		System.out.println("byte... "); 
	}
	public static void main(String[] args) 
	{ 
		byte b = 5; 
		go(b,b,b); // which go() will be invoked? 
	} 
}