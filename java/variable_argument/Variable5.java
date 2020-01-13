class Variable5 
{ 
	static void m(int ... a) 
	{ 
		System.out.print("m(int ...): Number of args: " + a.length + " Contents: "); 
		for(int x : a) 
		System.out.print(x + " "); 
		System.out.println(); 
	} 
	static void m(boolean... a) 
	{ 
		System.out.print("m(boolean ...) : Number of args: " + a.length + " Contents: "); 
		for(boolean x : a) System.out.print(x + " "); 
		System.out.println(); 
	} 
	static void m(String msg, int ... a) 
	{ 
		System.out.print("m(String, int ...): " + msg + a.length + " Contents: "); 
		for(int x : a) System.out.print(x + " "); 
		System.out.println(); 
	} 
	public static void main(String args[]) 
	{ 
		m(1, 2, 3); 
		m("Testing: ", 10, 20); 
		m(true, false, false); 
	} 
}